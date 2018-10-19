package team;

public class Tester {
    public String       fullname;
    public int          experience;
    public int          age;
    public float        salary;
    public String       technology;

    public Tester( int experience,int age,float salary){
        fullname = "Maxim";
        this.experience = experience;
        this.age = age;
        this.salary = salary;

    }

    public String toString(){
        return  "Tester " + fullname + " Experience " + experience + " Have " + age + "years" + " and " + salary + "Salary";
    }
    public void incrementSalary(){
        salary += salary * 0.3 + (experience * 0.5 );
    }
}
