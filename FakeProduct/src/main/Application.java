package main;

import entities.Product;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product.product = sc.next();

        while(true){
            System.out.println("###############\n" +
                    "           MENU\n" +
                    "           ###############" +
                    "           Please,select what you want to do;" +
                    "           Create a product;" +
                    "           Save to a file;" +
                    "           Load from a file;" +
                    "           Or exit");

            switch (Product.product){
                case "Create a product" : Product.createProduct();
                case "Save to a file"   : Product.saveProduct("/home/krypt0n/IdeaProjects/FakeProduct/src/newProduct.txt");
                case "Load from a file" : 
            }

        }

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
    }
}
