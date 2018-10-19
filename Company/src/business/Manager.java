package business;

import team.Programmer;
import team.Tester;

public class Manager {
    public String       fullname;
    public int          experience;
    public int          age;
    public float        salary;
    public Programmer lead_developer = new Programmer(20,38,2100);
    public Programmer senior_developer = new Programmer(9,27,1300);
    public Programmer junior_developer = new Programmer(2,23,600);
    public Tester quality_guy = new Tester(5,26,400);

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
        salary += 15;
    }
}
