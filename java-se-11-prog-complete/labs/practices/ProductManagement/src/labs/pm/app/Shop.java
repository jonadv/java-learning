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

        ProductManager pm = new ProductManager("nl-NL");
        pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), NOT_RATED);
        
        pm.reviewProduct(101, FOUR_STAR, "Nice hot cup of tea");
        pm.reviewProduct(101, THREE_STAR, "Ok tea");
        pm.reviewProduct(101, THREE_STAR, "Fine tea");
        pm.reviewProduct(101, FIVE_STAR, "Perfect tea");
        pm.reviewProduct(101, FIVE_STAR, "Finest cup of tea");
        pm.reviewProduct(101, FIVE_STAR, "Pleasent");
        pm.printProductReport(101);

        pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), NOT_RATED);
        pm.reviewProduct(102, FOUR_STAR, "Nice hot cup of coffee");
        pm.reviewProduct(102, THREE_STAR, "Ok coffee");
        pm.reviewProduct(102, THREE_STAR, "Fine coffee");
        pm.reviewProduct(102, FIVE_STAR, "Perfect coffee");
        pm.printProductReport(102);

        pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), NOT_RATED, LocalDate.now().plusDays(2));
        pm.reviewProduct(103, FIVE_STAR, "Very nice cake");
        pm.reviewProduct(103, FOUR_STAR, "It's good, but I've expected more chocolate");
        pm.reviewProduct(103, FIVE_STAR, "This cake is perfect!");
        pm.printProductReport(103);
    }

}
