package Balls;

public class PingBall extends BallBase{

    public void setVolume(float volume){
        if (volume >= 0.1 && volume <= 0.15){
//            this.volume = volume;
            super.setVolume(volume);
        }else {
            System.err.println("It will blow out");
        }

    }

    public String toString(){
        return super.toString() + "------PingBall-----\n";
    }
}
