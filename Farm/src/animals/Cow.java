package animals;

public class Cow {

    static int weight = 300;            //kg
    static int weight_limit = 500;
    static int age = 7;                 //age
    static int speed = 2;               //km/h
    static double milk = 0;             //l/day
    static double milk_limit = 10;
    static int food_0_value = 0;
    static String status = "alive";

    public static boolean eat(int food_kg) {
        if (food_kg != 0) {
            if (weight < weight_limit && milk < milk_limit) {
                weight += 0.1 * food_kg;
                milk += 0.2 * food_kg;
                sounds();
                aging();
                return true;
            }else return false;
        }else if (food_0_value != 10){
            food_0_value++;
            return true;
        }else {
            return false;
        }
    }
    public static void sounds(){
        System.out.println("Moo");
    }
    public static boolean walk(int distance){  //km
        //boolean ,
        if (weight < 350 && milk < 3 && distance == 5){
            weight -= 0.1 * distance;
            milk -= 0.2 * distance;
            return true;
        }else if ((weight > 350 && weight < 400) && (milk > 3 && milk < 6) && distance == 2){
            weight -= 0.2 * distance;
            milk -= 0.3 * distance;
            return true;
        }else if (weight > 400 && milk > 9 ){
            return false;
        }else{
            return false;
        }
    }
    public static void aging(){
        age += 1;
        if (age > 12){
            status = "dead";
        }else {
            status = "alive";
        }
    }
    public static void info(){
        System.out.println("Cow weight is ==> " + weight + "\n" + "Age is ==> " + age + "\n" +"Speed is ==> " + speed + "\n" + "And milk per day it gives ==> " + milk + " L per day" + age);
    }
}

//limit eat to 10 calls
