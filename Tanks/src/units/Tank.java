package units;

public class Tank {
    public String   player;
    public byte     armour;
    public byte     projectiles;
    public byte     damage;
    public byte     x;
    public byte     y;

    public Tank(String player ,byte damage,byte armour,byte projectiles){
        this.player = player;
        this.damage = damage;
        this.armour = armour;
        this.projectiles = projectiles;

    }
    public boolean isFunctional(){
        if (damage <= 50 && armour >= 25){
            return true;
        }else {
            return false;
        }
    }
    public double DistanceOtherTank(x,y){
        return Math.sqrt((Math.pow((this.x-x),2))+(Math.pow((this.y-y),2)));
    }

    public String toString(){
        return " Tank Armour is " + armour + " And coordinates are : x = " + x + " y " + y;
    }
}
