public class BackApp {
    public static void main(String[] args) {
        BackPack my_sac     = new BackPack(" XM");
        Laptop   laptop     = new Laptop(" Apple");
        book     manual     = new book(" How not to brake Apple laptop");
        my_sac.addThing(laptop);
        my_sac.addThing(manual);
        System.out.println(my_sac);
        //Tepochka
    }
}
class BackPack{
    String brand;
    float volume;
    byte pockets;
    byte sections;

//    Laptop note_section = null;
//    book book_section = null;

    Thing thing_section = null;

    // add put() and remove()

    BackPack(String brand){
        this.brand = brand;
        this.volume = 20;
        this.pockets = 3;
        this.sections = 2;
    }

    void addThing(Thing t){
        this.thing_section = t;
    }
    public String toString(){
        return "BackPack (brand = " + brand + ", volume = " + volume + ", pockets = " + pockets + ", sections = " + sections + ")";
    }
}
class Thing{
}
class Laptop extends Thing{
    String brand;
    public Laptop(String brand){
        this.brand = brand;
    }
}
class book extends Thing{
    String title;
    public book(String title){
        this.title = title;
    }
}