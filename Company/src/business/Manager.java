package business;

import team.Programmer;
import team.Tester;

public class Manager {
    public static String        fullname;
    public static int           experience;
    public static int           age;
    public static float         salary;
    public static Programmer    lead_developer;
    public static Programmer    senior_developer;
    public static Programmer    junior_developer;
    public static Tester        quality_guy;

    public Manager( int experience,int age,float salary){
        fullname = "Petru";
        this.experience = experience;
        this.age = age;
        this.salary = salary;

    }

    public String toString(){
        return  "Manager " + fullname + " Experience " + experience + " Have " + age + "years" + " and " + salary + "Salary";
    }
    public void incrementSalary(){
        salary *= 0.15;
    }
}
