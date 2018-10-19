package team;

public class Programmer {
    public static String       fullname;
    public static int          experience;
    public static int          age;
    public static float        salary;
    public static String       technology;

    public Programmer( int experience,int age,float salary) {
        fullname = "George";
        this.experience = experience;
        this.age = age;
        this.salary = salary;
        technology = "Java , Ruby , Python , C++";
    }

    public String toString() {
        return  "Programmer " + fullname + " Experience " + experience + " Have " + age + "years" + " and " + salary + "Salary";
    }
    public static void incrementSalary() {
        salary += salary * 0.5 + ((experience * 100) * 0.1 );
    }
}
