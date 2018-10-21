public class BackApp {
    public static void main(String[] args) {
        BackPack my_sac     = new BackPack(" XM");
        Laptop   laptop     = new Laptop(" Apple");
        Book     manual     = new Book(" How not to brake Apple laptop");
        System.out.println(my_sac);
        my_sac.addThing(laptop);
        my_sac.addThing(manual);
        System.out.println(my_sac);
        my_sac.removeThing(laptop);
        //Tepochka
    }
}
class BackPack extends Accessories{
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
        return "BackPack (brand = " + brand + ", volume = " + volume + ", pockets = " + pockets + ", sections = " + sections + ")"
                + " Things " + thing_section;
    }
    void removeThing(Thing t){
        this.thing_section = null;
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
class Book extends Thing{
    String title;
    public Book(String title){
        this.title = title;
    }
}
