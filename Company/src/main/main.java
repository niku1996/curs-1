package main;

import business.Director;
import business.Manager;
import business.SoftwareCompany;
import team.Programmer;
import team.Tester;

import static business.Manager.quality_guy;
public class main {
    public static void main(String[] args) {
        Director dir = new Director(20,40,9000);
        Manager.lead_developer = new Programmer(17,38,2100);
        Manager.senior_developer = new Programmer(11,29,1500);
        Manager.junior_developer = new Programmer(2,18,700);
        quality_guy = new Tester(4,25,400);
        Director.helper = new Manager(8,34,600);
        SoftwareCompany.calculateSalaryBudget();
        SoftwareCompany.showMembers();
    }
}
