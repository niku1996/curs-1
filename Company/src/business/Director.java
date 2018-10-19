package business;

public class Director {
    public static String   fullname;
    public static int      experience;
    public static int      age;
    public static float    salary;
    public static Manager         helper;

    public Director(int experience,int age,float salary ){
        fullname  = "Ion ";
        this.experience = experience;
        this.age = age;
        this.salary = salary;
    }

    public String toString(){
        return  "Director " + fullname + " Experience " + experience + " Have " + age + "years" + " and " + salary + "Salary";
    }
    public void incrementSalary(){
        salary *= 0.2;
    }
}
