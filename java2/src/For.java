import java.util.Scanner;

public class For {
    public static void main(String [] args){
//        for (start; condition; step){
//
//        }
//        for (int n = 1; n <= 10 ; n++){
//            System.out.print(n + " ");
//            if (n == 1 || n == 3 || n == 6){
//                System.out.println();
//        }
        Scanner in = new Scanner(System.in);
        int rr,cc;
        System.out.println("what number is r");
        rr = in.nextInt();
        System.out.println("what number is c");
        cc = in.nextInt();

        for (int r = 1 ; r <= 10 ; r++) {
            for (int c = 1; c <= 10; c++) {
                if (r == 1 || r == 10){
                    System.out.print("# ");
                }else if (c == 1 || c ==10){
                    System.out.print("# ");
                }else{
                    if (rr == r && cc == c){
                        System.out.print("x ");
                    }else{
                        System.out.print(". ");
                    }

                }
            }
            System.out.println();
        }
    }
  }
//}
