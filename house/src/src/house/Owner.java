package house;

public class Owner {
    public static String fullname;              //name
    public static int age;                      //years
    public static int food;                     //kg
    public static boolean have_food = true;     //if food is available
    public static int count = 0;
    public void setFood(int food){
        Owner.food = 80;
        if (food>0){
            have_food = true;
        }else {
            have_food = false;
        }
    }
    public static int getFood(int food){
        Owner.age++;
        Dog.weight += food;
        Dog.age++;
        System.out.println(" ########################\n You give food to your dog " + count + " time(s)");
        return Owner.food -= food;
    }
    public Owner(String fullname, int age, int food){
        this.fullname = fullname;
        this.age = age;
        this.food = food;
    }

}
