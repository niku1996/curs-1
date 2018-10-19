import java.util.Scanner; // namespacing

public class InputChallenge {
    public static void main(String [] args) {

        int Pay_per_hour = 20;
        int Week_days = 7;
        int Day_work_hours = 7;
        int Hours_per_week;
        int Payment_per_month;
        int Optional_work;
        int Optional_work_payment = 40;


        Hours_per_week = Week_days * Day_work_hours;
        Payment_per_month = Pay_per_hour * Hours_per_week;
        System.out.println("Payment per month ==> " + Payment_per_month + "USD");
        System.out.println("How much hours you coded after work?");
        Scanner Pay = new Scanner(System.in);
        Optional_work = Pay.nextInt() * Optional_work_payment;
        System.out.println("Optional payment per month ==> " + Optional_work);
        System.out.println("Total payment with optional work ==> " + ( Optional_work + Payment_per_month ));
    }
}
