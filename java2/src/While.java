public class While {
    public static void main(String[] args) {

        int a = 10;
        while ( a >= 1 ){
            System.out.println(a);
            if ( a == 5){
                System.out.println("----------------");
            }

            //a-=2;
            a--;
        }
    }
}
