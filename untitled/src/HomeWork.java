import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int rr,cc;
        System.out.println("what coordinates have r?");
        rr = in.nextInt();
        System.out.println("what coordinates have c?");
        cc = in.nextInt();

        for (int r = 0 ; r <= 10 ; r++) {
            System.out.print(r + " ");
            for (int c = 1; c <= 10; c++) {
                if (r == 0 ){
                    System.out.print(c + " ");
                }else if (r == 1 || r == 10){
                    System.out.print("# ");
//                    System.out.print(c + "\n");
                }else if (c == 1 || c ==10){
                    System.out.print("# ");
                }else{
                    if (rr == r || cc == c){
                        System.out.print("x ");
                    }else{
                        System.out.print(". ");
                    }
                }
            }System.out.println();
        }
    }
}

