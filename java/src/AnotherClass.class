import java.util.Scanner;

public class AnotherClass {
    public static void main(String [] args) {

        int Bears;

        double Bear_Price = 18.50;

        int Apples;

        double Apples_Price = 1.25;

        int Bananas;

        double Bananas_Price = 8;

        int Discount = 0;

        double TotalPrice;

        Scanner in = new Scanner(System.in);
        System.out.println("How much Apples you taked? ");
        Apples = in.nextInt();
        System.out.println("How much Bananas you taked? ");
        Bananas = in.nextInt();
        System.out.println("But hou much Bear bottles you taked? ");
        Bears = in.nextInt();

        TotalPrice = (Bears * Bear_Price + Bananas * Bananas_Price + Apples * Apples_Price);

        if (TotalPrice >= 100) {
            Discount = 5;
        }else if (TotalPrice <= 100){
            Discount = 3;
        }

        System.out.println("Original Price is ==> " + TotalPrice);
        System.out.println("DiscountPrice is ==> " + (TotalPrice - Discount) + (" MDL  : "  +  "Discount ==> " + Discount +"%"));
        System.out.println(Bears  + " Bears" + "   (" + Bear_Price + " MDL " + " x " + Bears + ")" + "==>" + Bear_Price * Bears);
        System.out.println(Apples + " Apples" + "   (" + Apples_Price + " MDL " + " x " + Apples +")" + "==>" + Apples_Price * Apples);
        System.out.println(Bananas + " Bananas" + "   (" + Bananas_Price + " MDL " + " x " + Bananas + ")" + "==>" + Bananas_Price * Bananas);
    }
}
