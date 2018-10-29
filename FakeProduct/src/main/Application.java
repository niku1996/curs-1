package main;
import entities.Product;

public class Application {
    public static void main(String[] args) {

        while(true){
            Product.printMenu();
            Product.Menu();
            break;
        }
    }
}
