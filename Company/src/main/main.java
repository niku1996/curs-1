package main;

import business.Director;
import business.SoftwareCompany;

public class main {
    public static void main(String[] args) {
        Director dir = new Director(20,40,9000);
        SoftwareCompany.showMembers();
    }
}
