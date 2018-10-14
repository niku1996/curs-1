package house;

public class Dog {
    public static int weight;   //g
    public static String name;     //name of house.Dog
    public static int age;         //years
    public Dog(String name, int weight, int age){
        this.weight = weight;
        this.name = name;
        this.age = age;
    }
    public static void info(){
        System.out.println("Name " + name + "\n Weight " + weight + " grams" + "\n Age " + age + " years");
    }

    public static void eat(int qauntity){
        weight += qauntity * 0.1;
        age++;
    }
}


