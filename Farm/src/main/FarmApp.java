package main;
import animals.Cow;
public class FarmApp {
    public static void main(String[] args) {
        //Cow.info
        System.out.println("Cow ");
        Cow.info();
        while (Cow.eat(20));
        System.out.println("Cow after eat ");
        Cow.info();
        Cow.walk(5);
        System.out.println("Cow after walk");
        Cow.info();
    }
}
