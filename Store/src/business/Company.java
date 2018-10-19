package business;

public class Company{
    static double k;
    static int salary;
    static int years = 10;
    static long capital = 20000;
    static int employees = 30;
    public static void about(){
        System.out.println("Company have " + years + " years \n" + "Capital is " + capital +" $ \n" + "And have " + employees + "employess");
    }
    public static int calculateSalary(int experience,int hours_month,int earn){
        if (experience < 3 && experience > 0 ){
            k = 0.25;
        }else if (experience < 5 && experience >3){
            k = 0.55;
        }else if (experience < 10 && experience > 5){
            k = 0.90;
        }else if (experience < 20 && experience > 10){
            k = 1;
        }
        salary = (int) (k * hours_month * earn);
        System.out.println(salary);
        return salary;
    }
}
