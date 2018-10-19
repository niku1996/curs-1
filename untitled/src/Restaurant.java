import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args){
        showMenu();
        showCost();
        System.out.println("Please,select what you want to order:");
        selectOption();
    }
    public static void showMenu(){
        System.out.println("==================Menu=================");
        Menu();
    }
    public static void showCost(){
        int Soup_Price = 30;
        int Lasagna_Price = 70;
        int Cesar_Salad_Price = 25;
        int Business_Lunch_Price = 120;
        System.out.println("Soup  ==> " +  Soup_Price + "MDL\n" + "Lasagna ==> " + Lasagna_Price + "MDL\n" + "Cesar Salad  ==> " + Cesar_Salad_Price + "MDL\n" + "Business Lunch ==> " + Business_Lunch_Price + "MDL");
    }
    public static void Menu(){
        System.out.println(" Soup; \n Lasagna; \n Cesar salad; \n Business lunch;");
        System.out.println("========================================");

    }

    public static String selectOption(){
        int Cost = 0;
        String finalOption = null;
        Scanner in = new Scanner(System.in);
        String variant = in.next();

        if (variant.equals("Cesar") || variant.equals("Soup")){
            System.out.println("You selected " + variant);
            finalOption = "Cesar";
        }else if (variant.equals("Soup")){
            System.out.println("You selected " + variant);
            finalOption = "Soup";
        }else if(variant.equals("Lasagna")){
            System.out.println("You selected " + variant);
            finalOption = "Lasagna";
        }else if (variant.equals("Business Lunch")){
            System.out.println("You selected " + variant);
            finalOption = "Business Lunch";
        }else if (variant.equals("Cesar") || variant.equals("Soup")){
            System.out.println("You selected Soup with Cesar");
            finalOption = "Soup with Cesar";
        }

        int Cesar_Salad_Price = 25;
        int Lasagna_Price = 70;
        int Business_Lunch_Price = 120;
        int Soup_Price = 30;

        switch (finalOption) {
            case "Cesar":
                Cost = Cesar_Salad_Price;
                break;
            case "Lasagna":
                Cost = Lasagna_Price;
                break;
            case "Soup":
                Cost = Soup_Price;
                break;
            case "Business Lunch":
                Cost = Business_Lunch_Price;
                break;
        }
        System.out.println(Cost + "MDL");
        return finalOption;
    }
}
//advanced menu(genereal,categories...)
