package units;

public class Tank {
    public String   player;
    public byte     armour;
    public byte     projectiles;
    public byte     damage;
    public byte     x;
    public byte     y;

    public Tank(String player ,int damage,int armour,int projectiles,int x,int y){
        this.player = player;
        this.damage =(byte) damage;
        this.armour = (byte )armour;
        this.projectiles =(byte) projectiles;
        this.x = (byte)x;
        this.x = (byte)y;

    }
    public boolean isFunctional(){
        if (damage <= 50 && armour >= 25){
            return true;
        }else {
            return false;
        }
    }
    public double DistanceOtherTank(int x,int  y){
        return Math.sqrt((Math.pow((this.x-x),2))+(Math.pow((this.y-y),2)));
    }

    public String toString(){
        return " Tank Armour is " + armour + " And coordinates are : x = " + x + " y = " + y;
    }
}
