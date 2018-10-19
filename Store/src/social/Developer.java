package social;
public class Developer {
    static byte age = 28;
    static byte earn = 30;
    static byte experience = 8;
    float salary = 2700;
    public static void sayHi(int language){
        String en = "Hello my friend";
        String ru = "Privet moi drug";
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
        sayHi(1);
        System.out.println("My name is John \n" + "I work at best store in the world \n" + "I have " + age + " years \n" + "My experience from 0 to 10 is " + experience);
    }
}
