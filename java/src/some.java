import java.util.Scanner;

public class some {
//    scanner = simestr,3 note,semestru 1 2 examen ,pe an = s1 0.3 s2 0.3 examen 0.4
    public static void main(String[] args){

        int Simestru_1;
        int Simestru_2;
        int Examen;
        int Anual;


        Scanner in = new Scanner(System.in);
        System.out.println("Semestru 1");
        Simestru_1 = in.nextInt();
        System.out.println("Semestru 2");
        Simestru_2 = in.nextInt();
        System.out.println("Examen");
        Examen = in.nextInt();
        Anual = (int) ((Simestru_1 * 0.3) + (Simestru_2 * 0.3) + (Examen * 0.4));
        System.out.println("Nota anuala = " + Anual);

        if (Anual <= 8 && Anual >= 5) {
            System.out.println("Good");
        }if (Anual <= 5 && Anual >= 1) {
            System.out.println("Bad");
        }if (Anual <= 10 && Anual >= 8 ) {
            System.out.println("Excellent");

    }
}}
