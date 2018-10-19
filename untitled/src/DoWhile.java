import java.util.Scanner;

public class DoWhile {
    public static void main(String [] args){

        Scanner in = new Scanner(System.in);

        final int PIN = 1111;
        int pin;

        do{
            System.out.println("Pin ==>");
            pin = in.nextInt();
        }while(pin != PIN);
    }
}

//Messages for print
//only 3 chances only if not correct
