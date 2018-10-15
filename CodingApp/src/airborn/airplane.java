package airborn;
//base class / super
public class airplane {
    public int distance;
    private int fuel;
    public byte seates;
    public airplane() {

    }
    public void setFuel(int fuel) {
        if (fuel>0) {
            this.fuel = fuel;
        }else {
            System.err.println("Negative fuel or seates number!!!");
        }
    }
    public int getFuel() {
        return this.fuel;
    }
    public airplane(int fuel,int seates) {
        if (fuel>0 && seates>0) {
            this.distance = 0;
            this.fuel = fuel;
            this.seates = (byte) seates;
        }else{
            System.err.println("Negative fuel or seates number!!!");
        }
    }
    public String toString() {
        return "\n Plane \n Tank " + this.fuel
        + "\n Seates " + this.seates + "\n Distance " + this.distance;
    }
}
