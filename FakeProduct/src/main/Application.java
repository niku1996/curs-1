package main;

import entities.Product;

import java.util.Date;

public class Application {
    public static void main(String[] args) {

        // while(){
        //Menu
            // 1. create product
            // 2.save file
            // 3.load
            // 4.exit
       //}

//        Product p = new Product("Drinks",
//                                    "Coca Cola",
//                                    15.50f,
//                              "Coca inc.",
//                                           new Date()
//        );
        Product p = new Product();
        System.out.println(p);
        p.saveToFile("/home/krypt0n/IdeaProjects/FakeProduct/src/product.txt");
    }
}
