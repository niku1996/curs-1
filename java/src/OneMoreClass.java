public class OneMoreClass {
    public static void main(String [] args) {
        boolean entrance_door = true;
        boolean apartment_door = true;
        boolean Kitchen = false;

        if (entrance_door) {
            System.out.println("Entered Building");
            if (apartment_door) {
                System.out.println("Entered Apartment");
                if (Kitchen) {
                    System.out.println("Entered in Kitchen");
                }else{
                    System.err.println("Cant Enter in Kitchen");
                }
            }else {
                System.err.println("Cant Enter Apartment");
            }
        }else {
            System.err.println( "Cant Enter Building");
        }
    }
}
