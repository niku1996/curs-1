import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        // Stream --> I/O
        // app <---------> keyboard/screen/files/network
        int current_year = 2018;
        int birth_year;

        System.out.println("Your birth year? :");
        Scanner in = new Scanner(System.in);
        birth_year = in.nextInt();

        int age = current_year - birth_year;
        System.out.println("You are " + age + "year old ");
    }
}
