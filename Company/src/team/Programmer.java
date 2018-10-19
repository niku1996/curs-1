package team;

public class Programmer {
    public String       fullname;
    public int          experience;
    public int          age;
    public float        salary;
    public String       technology;

    public Programmer( int experience,int age,float salary){
        fullname = "George";
        this.experience = experience;
        this.age = age;
        this.salary = salary;

    }

    public String toString(){
        return  "Programmer " + fullname + " Experience " + experience + " Have " + age + "years" + " and " + salary + "Salary";
    }
    public void incrementSalary(){
        salary += salary * 0.5 + ((experience * 100) * 0.1 );
    }
}
