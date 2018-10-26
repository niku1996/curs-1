package entities;

import com.github.javafaker.Faker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;
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

    public Product(String category, String name, float price, String manufacture, Date date){
            this.category = category;
            this.name = name;
            this.price = price;
            this.manufacture = manufacture;

    }
    public String toString(){
        return "Product category: " + category + " Name: " + name + "\n Price: " + price + "\n Manufacturer: " + manufacture + "\n Date: " + expires;
    }
    public void saveToFile(String file_name){
        try{
            FileWriter fw = new FileWriter(new File(file_name));
            fw.write(this.toString());
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
            System.err.println("File Error");
        }

    }
}
