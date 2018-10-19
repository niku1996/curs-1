package main;

import business.Company;
import social.Designer;

public class Store{
    public static void main(String[] args) {
        Designer.sayHi(2);
        Company.calculateSalary(Designer.experience,140,Designer.earn);
    }
}
