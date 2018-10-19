package business;

import team.Programmer;
import team.Tester;

public class Manager {
    public String       fullname;
    public int          experience;
    public int          age;
    public float        salary;
    public Programmer lead_developer = new Programmer();
    public Programmer senior_developer = new Programmer();
    public Programmer junior_developer = new Programmer();
    public Tester quality_guy = new Tester();

    public String toString(){

    }
    public void incrementSalary(){

    }
}
