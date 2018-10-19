public class main {

     public static void main(String[] args){

         int money_eur = 1000;
         int money_usd = 500;
         double koef_eur = 19.5;
         double koef_usd = 15.5;

         System.out.println(money_eur + " euro converts to = " + money_eur * koef_eur  + "MDL" );
         System.out.println(money_usd + " dollars converts to = " + money_usd * koef_usd + "MDL");

         // city A , B 5000; speed of car 160 ; litres needed , car=5L per 100km ;days need = ?;

         int distance = 5000;
         int speed = 160;
         int consum = 5;

         System.out.println(distance / speed + " hours");
         System.out.println(distance / speed * consum + "L consuming");


     }
}
