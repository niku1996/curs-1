public class Break {
    public static void main(String [] args) {

        int n = 1;
        while (n <= 10 ) {

            System.out.print(n + " - ");
            System.out.print("A");
            if (n == 5){
                break;
            }
            System.out.print("B");
            if (n == 3){
                break;
            }
            System.out.print("C");
            System.out.println();

            n++;
        }
    }
}
