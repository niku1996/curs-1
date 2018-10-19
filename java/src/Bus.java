import java.util.Scanner;

public class Bus {
    public static void main(String [] args) {
        float consume = 3.7f;
        float fuel = 30.5f;
        float tank = 50.0f;
        double fuel_price_per_litre = 18;
        int passenger_price = 3;
        int passenger = 0;
        double passengers_per_day = 0;
        double fuel_to_refill;
        double Income;

        int tour = 0;

        while( fuel >= consume ){

            tour++;
            System.out.println("Starting tour ==> " + tour);
            passengers_per_day += ( passenger );

            fuel -= consume;
            System.out.println("How much passengers on this tour? ");
            Scanner a = new Scanner(System.in);
            passenger = a.nextInt();
            System.out.println("Finished tour ==> " + tour);
        }
        
        fuel_to_refill = tank - fuel;
        Income = (passengers_per_day * passenger_price) - (fuel_to_refill * fuel_price_per_litre);
        System.out.println("Not enough fuel!\nFuel Left ==> " + fuel);
        System.out.println("Price to refill fuel back ==> " + fuel_to_refill * fuel_price_per_litre + "MDL");
        System.out.println("Total passenger per day ==> " + passengers_per_day );
        System.out.println("Fuel to refill ==> " + (tank - fuel) + "L");
        System.out.println("Passenger money gain ==> " + passengers_per_day * passenger_price + "MDL");
        System.out.println("Income per day ==> " + Income + "MDL");

    }
}
