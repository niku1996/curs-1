package Balls;

public class BallBase {
    float volume = 2;           //litres

    public void jump(int height){
        System.out.println("Jumping to " + height + " Meters\n");
    }

    public float getVolume(){
        return volume;
    }
    public void setVolume(float volume){
        this.volume = volume;
    }

    public String toString(){
        return "####Ball####\n" + "Vol: " + volume + " Litres\n";
    }
}
