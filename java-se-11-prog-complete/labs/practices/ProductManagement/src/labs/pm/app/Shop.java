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
package labs.pm.app;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.Locale;
import labs.pm.data.Drink;
import labs.pm.data.Food;
import labs.pm.data.Product;
import labs.pm.data.ProductManager;
import static labs.pm.data.Rating.*;

/**
 * (@code Shop) class represents an application that manages Products
 *
 * @version 4.0
 * @author Jonathan
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ProductManager pm = new ProductManager("gb-GB");
//        pm.createProduct(101, "Tea", BigDecimal.valueOf(6.99), NOT_RATED);
//        pm.reviewProduct(101, FIVE_STAR, "Perfect tea");
//        pm.reviewProduct(101, FIVE_STAR, "Finest cup of tea");
//        pm.reviewProduct(101, FIVE_STAR, "Pleasent");
            for (var i=100; i<164;i++){
                pm.printProductReport(i);
            }
        Comparator<Product> ratingSorter = (p1, p2) -> p2.getRating().ordinal() - p1.getRating().ordinal();
        Comparator<Product> priceSorter = (p1, p2) -> p2.getPrice().compareTo(p1.getPrice());
        Predicate<Product> filter = (p1 -> p1.getPrice().floatValue() > 2.0f); //compareTo(BigDecimal.valueOf(1.0)) > -1);
        pm.printProducts(filter, ratingSorter);
        pm.printProducts(filter, priceSorter.thenComparing(ratingSorter).reversed());

        pm.getDiscounts().forEach((rating, discount) -> System.out.println(rating + "\t" + discount));
    }
}
