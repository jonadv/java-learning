/*
 * Copyright (C) 2021 Jonathan
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package labs.pm.data;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jonathan
 */
public class ProductManager {

    private Map<Product, List<Review>> products = new HashMap<>();
    private ResourceFormatter formatter;
    private ResourceBundle config = ResourceBundle.getBundle("labs.pm.data.config");
    private MessageFormat productFormat = new MessageFormat(config.getString("product.data.format"));
    private MessageFormat reviewFormat = new MessageFormat(config.getString("review.data.format"));
    private static Map<String, ResourceFormatter> formatters = Map.of(
            "en-GB", new ResourceFormatter(Locale.UK),
            "en-US", new ResourceFormatter(Locale.US),
            "fr-FR", new ResourceFormatter(Locale.FRANCE),
            "ru-RU", new ResourceFormatter(new Locale("ru", "RU")),
            "zh-Cn", new ResourceFormatter(Locale.CHINA),
            "nl-NL", new ResourceFormatter(new Locale("nl", "NL")));
    private static final Logger logger = Logger.getLogger(ProductManager.class.getName());

    public ProductManager(Locale locale) {
        this(locale.toLanguageTag());
    }

    public ProductManager(String languageTag) {
        changeLocale(languageTag);
    }

    public void changeLocale(String languageTag) {
        formatter = formatters.getOrDefault(languageTag, formatters.get("en-GB"));
    }

    public static Set<String> getSupportedLocales() {
        return formatters.keySet();
    }

    public Product createProduct(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) {
        Product product = new Food(id, name, price, rating, bestBefore);
        products.putIfAbsent(product, new ArrayList<Review>()); //uses overriden method equals in Product class
        return product;
    }

    public Product createProduct(int id, String name, BigDecimal price, Rating rating) {
        Product product = new Drink(id, name, price, rating);
        products.putIfAbsent(product, new ArrayList<Review>()); //uses overriden method equals in Product class
        return product;
    }

    public Product reviewProduct(int id, Rating rating, String comments) {
        try {
            return reviewProduct(findProduct(id), rating, comments);
        } catch (ProductManagerException ex) {
            logger.log(Level.INFO, ex.getMessage());
        }
        return null;
    }

    public Product reviewProduct(Product product, Rating rating, String comments) {
        List<Review> reviews = products.get(product);
        products.remove(product, reviews);
        reviews.add(new Review(rating, comments));
        product = product.applyRating(
                Rateable.convert(
                        (int) Math.round(
                                reviews.stream()
                                        .mapToInt((review) -> review.getRating().ordinal())
                                        .average()
                                        .orElse(0))));
        products.put(product, reviews);
        return product;
    }

    public Product findProduct(int id) throws ProductManagerException {
        return products.keySet()
                .stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ProductManagerException("Product with id " + id + " not found"));
    }

    public void printProductReport(int id) {
        try {
            printProductReport(findProduct(id));
        } catch (ProductManagerException ex) {
            logger.log(Level.INFO, ex.getMessage());
        }

    }

    public void printProductReport(Product product) {
        List<Review> reviews = products.get(product);
        Collections.sort(reviews);
        StringBuilder txt = new StringBuilder();
        txt.append(formatter.formatProduct(product));
        txt.append('\n');
        if (reviews.isEmpty()) {
            txt.append(formatter.getText("no.reviews"));
            txt.append('\n');
        } else {
            txt.append(
                    reviews.stream()
                            .map((review) -> formatter.formatReview(review) + '\n')
                            .collect(Collectors.joining()));
        }
        System.out.println(txt);
    }

    public void printProducts(Predicate<Product> filter, Comparator<Product> sorted) {
        StringBuilder txt = new StringBuilder();
        products.keySet()
                .stream()
                .sorted(sorted)
                .filter(filter)
                .forEach((product) //sequential, not parallel safe
                        -> txt.append(formatter.formatProduct(product) + '\n'));
        System.out.println(txt);
    }

    public void parseReview(String text) {
        try {
            Object[] values = reviewFormat.parse(text);
            reviewProduct(
                    Integer.parseInt((String) values[0]),
                    Rateable.convert(Integer.parseInt((String) values[1])),
                    (String) values[2]);
        } catch (ParseException ex) {
            logger.log(Level.WARNING, "Error parsing review " + text, ex);
        }
    }

    /**
     * returns a {@link java.util.Map} object where <br>
     * key = stars value as String <br>
     * value = calculated discount figure as String
     * <br>
     */
    public Map<String, String> getDiscounts() {
        return products.keySet()
                .stream()
                .collect(
                        Collectors.groupingBy(
                                product -> product.getRating().getStars(),
                                Collectors.collectingAndThen(
                                        Collectors.summingDouble(
                                                product -> product.getDiscount().doubleValue()),
                                        discount -> formatter.moneyFormat.format(discount))));
    }

    private static class ResourceFormatter {

        private Locale locale;
        private ResourceBundle resources;
        private DateTimeFormatter dateFormat;
        private NumberFormat moneyFormat;

        private ResourceFormatter(Locale locale) {
            this.locale = locale;
            resources = ResourceBundle.getBundle("labs.pm.data.resources", locale);
            dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).localizedBy(locale);
            moneyFormat = NumberFormat.getCurrencyInstance(locale);
        }

        private String formatProduct(Product product) {
            return MessageFormat.format(getText("product"),
                    product.getName(),
                    moneyFormat.format(product.getPrice()),
                    product.getRating().getStars(),
                    dateFormat.format(product.getBestBefore()));
        }

        private String formatReview(Review review) {
            return MessageFormat.format(getText("review"),
                    review.getRating().getStars(),
                    review.getComments());
        }

        private String getText(String key) {
            return resources.getString(key);
        }
    }
}
