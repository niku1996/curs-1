public class Pattern1 {
    public static void main(String [] args){
        int n = 1;
        int interval = 1;
        int i = 1;
        while( n <= 20) {
            if( n % 2 == 0 ){
                System.out.print("#");
                interval++;
            }else{
                i = 1;
                while (i <= interval){
                    System.out.print("* ");
                    i++;
                }
            }
        }
    }
}
