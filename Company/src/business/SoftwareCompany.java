package business;

public class SoftwareCompany {
    public static String       name;
    public static int          year;
    public static float salary_budget;
    public static class Address {

    }
    public static class Contacts {

    }
    public static class Team {

    }

    public static void showMembers(){
        System.out.println("Name " + " Job " + "     Experience " + "Salary \n" + "##################################");
        System.out.println(Director.fullname + "| Director|" + Director.experience + "        |" + Director.salary);
    }
//    public int calculateSalaryBudget(){
//
//    }
}
