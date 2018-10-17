package Balls;

public class BallBase {
    float volume = 2;           //litres

    public float getVolume(){
        return volume;
    }
    public void setVolume(float volume){
        this.volume = volume;
    }

    public String toString(){
        return "####Ball####\n" + "Vol: " + volume + "Litres\n";
    }

}
