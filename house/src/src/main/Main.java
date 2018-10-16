package main;

import house.Dog;
import house.Owner;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Snow",520,3);
        Owner own1 = new Owner("Ion Petru",20,80);
        while (Owner.have_food && Owner.food > 0){
            Owner.count++;
            Dog.eat(Owner.getFood(2));
        }
        System.out.println(dog1.toString());
    }
}

