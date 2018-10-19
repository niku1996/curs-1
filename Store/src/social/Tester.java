package social;

public class Tester {
    static byte age = 21;
    static byte earn = 15;
    static byte experience = 3;
    static float salary = 1350;
    public static void sayHi(int language){
        String en = "Hello my friend,i'm Company tester";
        String ru = "Privet moi drug,ia tester Campanii";
        String fr = "Bonjour,mon ami";
        if (language == 1){
            System.out.println(en);
        }else if (language == 2){
            System.out.println(ru);
        }else if (language == 3){
            System.out.println(fr);
        }
    }
    public static void about(){
        sayHi(2);
        System.out.println("My name is Chris \n" + "I work at best store in the world \n" + "I have " + age + " years \n" + "My experience from 0 to 10 is " + experience);
        System.out.println("I test all commits and all products");
    }
}
