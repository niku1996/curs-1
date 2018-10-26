package main;

import entities.Product;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
//        Product p = new Product("Drinks",
//                                    "Coca Cola",
//                                    15.50f,
//                              "Coca inc.",
//                                           new Date()
//        );
        Product p = new Product();
        System.out.println(p);
    }
}
