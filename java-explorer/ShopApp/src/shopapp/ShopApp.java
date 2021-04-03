/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopapp;

import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;

/**
 *
 * @author Jonathan
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Customer c1 = new Customer("Pinky", "M");

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing[] items = {item1, item2, new Clothing("Green T-shirt", 12, "XL"), new Clothing("Blue T-Shirt", 10.5, "S")};

        c1.addItems(items);
        System.out.println("Customer is " + c1.getName() + "," + c1.getSize() + "," + c1.getTotalClothingCost());

        for (Clothing item : c1.getItems()) {
            System.out.println("Item output" + item);
        }

        int average = 0;
        int count = 0;

        for (Clothing item : c1.getItems()) {    //7.1
            if (item.getSize().equals("L")) {
                count++;
                average += item.getPrice();
            };
        }

        try {
            average = (count == 0) ? 0 : average / count;
            average = average / count;
            System.out.println("Average price " + average + ", Count " + count);
        } catch (ArithmeticException e) {
            System.out.println("Don't devide by 0");
        }

        Arrays.sort(c1.getItems()); //8.2
        for (Clothing item : c1.getItems()) {
            System.out.println("Item output " + item);
        }
        
        try {
            ItemList list = new ItemList(items);
            Routing routing = Routing.builder().get("/items", list).build();
            ServerConfiguration config = ServerConfiguration.builder()
                    .bindAddress(InetAddress.getLocalHost())
                    .port(8888).build();
            WebServer ws = WebServer.create(config, routing);
            ws.start(); 
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }

}
