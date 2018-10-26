package entities;

import com.github.javafaker.Faker;

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
        return "Product category: " + category + " Name: " + name + " Price: " + price + " Manufacturer: " + manufacture + " Date: " + expires;
    }
}
