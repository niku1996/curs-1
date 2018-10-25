import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int price;
        float vat;
        Scanner in = null;//new Scanner(System.in);
        System.out.println("Enter price: ");
        try {
            price = in.nextInt();
            vat = (float)(price * 0.2);
            System.out.println(vat);
        } catch (InputMismatchException e){
            System.err.println("Error");
        } catch (NullPointerException e){
            System.err.println("Broken");
        }
    }
}
