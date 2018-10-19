public class Farm {
    public static void main(String[] args) {
        Chicken.eat(5);
        Chicken.speak();
        System.out.println("##################\n");
        Cow.eat(3);
        Cow.speak();
        System.out.println("##################\n");
        Bull.eat(3);
        Bull.speak();
        System.out.println("##################\n");
    }
}
class Chicken{
    static double weight = 2.5;
    public static void speak(){
        System.out.println("cluck cluck \n Chicken now have " + weight + "kg");
    }
    public static float eat(float portion){
        float limit = 4;
        int percent = 10;
        if (portion < 5) {
            for (int n = 1; n <= portion; n++) {
                if (n == portion) {
                    percent *= n;
                }
                if (n <= limit) {
                    System.out.println("Chicken eat portion " + n);
                }
                if (n > limit) {
                    break;
                }
            }return (float) (Chicken.weight =  ((weight / 100) * percent) + weight);
        }else{
            System.out.println("You cant eat more then " + limit);
        }return (float) weight;
    }
}
class Cow{
    static double weight = 730;

    public static void speak(){
        System.out.println("Moo,Moo \n Cow now have "  + weight + "kg");
    }

    public static float eat(float portion){
        float limit = 3;
        int percent = 5;
        if (portion < 5) {
            for (int n = 1; n <= portion; n++) {
                if (n == portion) {
                    percent *= n;
                }
                if (n <= limit) {
                    System.out.println("Cow eat portion " + n);
                }
                if (n > limit) {
                    break;
                }
            }return (float) (Cow.weight =  ((weight / 100) * percent) + weight);
        }else{
            System.out.println("You cant eat more then " + limit);
        }return (float) weight;
    }
}
class Bull{
    static double weight = 1090;

    public static void speak(){
        System.out.println("Bawl,Bawl \n Bull now have "  + weight + "kg");
    }

    public static float eat(float portion){
        float limit = 4;
        int percent = 15;
        if (portion < 5) {
            for (int n = 1; n <= portion; n++) {
                if (n == portion) {
                    percent *= n;
                }
                if (n <= limit) {
                    System.out.println("Bull eat portion " + n);
                }
                if (n > limit) {
                    break;
                }
            }return (float) (Bull.weight = ((weight / 100) * percent) + weight);
        }else{
            System.out.println("You cant eat more then " + limit);
        }return (float) weight;
    }
}