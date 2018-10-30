import java.util.Scanner;

public class AppStream {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =-1 ;
        do {
            System.out.println("Enter a integer");
            try {
                n = in.nextInt();
            }catch (Exception e ){
                System.err.println("Wrong format");
            }
        }while (n != 0);
    }
}
