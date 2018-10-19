package social;

public class Designer {
    static byte age = 23;
    public static byte earn = 17;
    public static byte experience = 4;
    static float salary = 1450;
    public static void sayHi(int language){
        String en = "Hello my friend,i'm Company designer";
        String ru = "Privet moi drug,ia desainer Campanii";
        String fr = "Bonjour,mon ami";
//        if (language == 1){
//            System.out.println(en);
//        }else if (language == 2){
//            System.out.println(ru);
//        }else if (language == 3){
//            System.out.println(fr);
//        }
        switch (language){
            case 1: System.out.println(en);break;
            case 2: System.out.println(ru);break;
            case 3: System.out.println(fr);break;
        }
    }
    public static void about(){
        sayHi(2);
        System.out.println("My name is Ammy \n" + "I work at best store in the world \n" + "I have " + age + " years \n" + "My experience from 0 to 10 is " + experience);
        System.out.println("I design interface,logo and all that stuff");
    }

}
