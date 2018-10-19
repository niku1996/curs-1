public class Home {
    public static void main(String[] args) {
        John.sayHi();
        John.iWantLights();
        Lucy.sayHi();
    }
    public static void switchOnLights(){
        System.out.println("Yes Lord!Lights are ON");
    }
}
class John{
    public static void sayHi(){
        System.out.println("Hi,my name is John");
    }
    public static void iWantLights(){
        Home.switchOnLights();
    }
}
class Lucy{
    public static void sayHi(){
        System.out.println("Darova! i need vodka ");
    }
}