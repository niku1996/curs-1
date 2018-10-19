package business;

public class SoftwareCompany {
    public static String       name = "BestSoftware";
    public static int          year;
    public static float salary_budget;
    public static int working_months = 10;


    public SoftwareCompany(int year){
        this.year = year;
    }
    public static class Address {
        String country = "Canada";
        String city = "Vancouver";
    }
    public static class Contacts {
        public static int number = 75837048;
        public static String email = "BestSoftware@gmail.com";
    }
    public static class Team {

    }

    public static void showMembers(){
        System.out.println( name + " Company : ");
        System.out.println("Name " + " Job " + "     Experience " + "Salary \n" + "####################################");
        System.out.println(Director.fullname + "  | Director  |" + Director.experience + "       |" +(int) Director.salary+" Eur| \n" +
                           Manager.fullname  + " | Manager   |" + Manager.experience  + "        |" +(int) Manager.salary +"  Eur| \n" +
                           Manager.lead_developer.fullname + "| Developer |" + Manager.lead_developer.experience + "       |" + (int) Manager.lead_developer.salary+" Eur|\n"+
                           Manager.senior_developer.fullname + "| Developer |" + Manager.senior_developer.experience + "       |" +(int) Manager.senior_developer.salary+" Eur|\n"+
                           Manager.junior_developer.fullname + "| Developer |" + Manager.junior_developer.experience + "        |" +(int) Manager.junior_developer.salary+"  Eur|\n"+
                           Manager.quality_guy.fullname + " | Tester    |" + Manager.quality_guy.experience + "        |" + (int) Manager.quality_guy.salary + "  Eur|\n" +
                           "####################################");
        System.out.println("Anual Salary Budget ==>" + (int)salary_budget + " Eur" + "\n" +
                            "Contacts : " + Contacts.number + "\n" + Contacts.email);
    }
    public static int calculateSalaryBudget(){
        salary_budget = (working_months * (Manager.junior_developer.salary + Manager.senior_developer.salary + Manager.lead_developer.salary
                        + Director.salary + Manager.quality_guy.salary + Manager.salary));
        return (int) salary_budget;
    }
}
