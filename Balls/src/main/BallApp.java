package main;
import Balls.*;

public class BallApp {
    public static void main(String[] args) {
        FoodBall football = new FoodBall();
        BasketBall basketball = new BasketBall();
        PingBall pingBall = new PingBall();
        Rugby  rugby = new Rugby();
        football.setVolume(20);
        rugby.setVolume(8);
        System.out.println(football.toString() + basketball + pingBall + rugby);
    }
}