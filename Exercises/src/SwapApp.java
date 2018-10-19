import java.util.Scanner;

public class SwapApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a,b");
        int a = in.nextInt();
        int b = in.nextInt();

        a = a - b;
        b = a + b;
        a = b - a;

        System.out.println("a = " + a + "\n b = " + b);
    }
}
