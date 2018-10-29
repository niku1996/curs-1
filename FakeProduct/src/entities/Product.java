package entities;
import com.github.javafaker.Faker;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Product {
    String category;
    String name;
    String manufacture;
    Date expires;
    float price;

    //generate with faker
    public Product(){
        Faker f = new Faker(new Locale("ru"));
        this.category = f.lorem().word();
        this.name = f.commerce().productName();
        this.price = Float.valueOf(f.commerce().price(100,1000));
        this.manufacture = f.chuckNorris().fact();
        this.expires = f.date().future(100,TimeUnit.DAYS);
    }

    public Product(String category, String name, float price, String manufacture){
            this.category = category;
            this.name = name;
            this.price = price;
            this.manufacture = manufacture;
    }
    public static void Menu(){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String product;
        product = sc.next();
        if (product.equals("Create")){
            System.out.println("Created new Product!!!");
            Product p = new Product();
            count++;
            product = sc.next();
            if (product.equals("Save")){
                p.saveProduct();
                System.out.println("Saved!!!");
                product = sc.next();
            }else {
                System.out.println("Didn't saved");
            }
            if (product.matches("Load")){
                p.loadProduct("/home/krypt0n/IdeaProjects/FakeProduct/src/savedProduct.txt");
                System.out.println("Loaded!!!");
            }else {
                System.out.println("Didn't loaded");
            }
        }if (product.equals("Createaproduct") && count == 1 ){
            System.out.println("You already have a product");
        }else {
            System.out.println("You didn't typed anything or typed incorrect");
        }
    }
    public static void printMenu(){
        System.out.println("###############" +
                "           \nMENU" +
                "           \n###############" +
                "           \nPlease,select what you want to do;" +
                "           \nCreate a product;" +
                "           \nSave to a file;" +
                "           \nLoad from a file;" +
                "           \nOr exit" +
                "           \n###############" +
                "           \n\n");
    }
    private void saveProduct(){
        try {
            FileWriter fw = new FileWriter(new File("/home/krypt0n/IdeaProjects/FakeProduct/src/savedProduct.txt"));
            fw.write("Category: " + category + "Name: " + name + "Price: " + price + "Manufacturer: " + manufacture + "Expires: " + expires);
            System.out.println("Created: " + fw);
            fw.close();
        }catch (IOException e){
            System.err.println("File Error\n");
            e.printStackTrace();
        }
    }
    private void loadProduct(String file){
        try {
            FileReader fr = new FileReader(new File(file));
            Scanner sr = new Scanner(new File("/home/krypt0n/IdeaProjects/FakeProduct/src/savedProduct.txt"));
            String data = sr.nextLine();
            System.out.println("Loaded!!!\n" + data);
            fr.close();
        }catch (IOException e){
            System.err.println("File Error");
            e.printStackTrace();
        }
    }
    public String toString(){
        return "Product category: " + category + " Name: " + name + "\n Price: " + price + "\n Manufacturer: " + manufacture + "\n Date: " + expires;
    }
//    public void saveToFile(String file_name){
//        try{
//            FileWriter fw = new FileWriter(new File(file_name));
//            fw.write(this.toString());
//            fw.close();
//        }catch (IOException e){
//            e.printStackTrace();
//            System.err.println("File Error");
//        }
//    }
}
