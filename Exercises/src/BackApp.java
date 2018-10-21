public class BackApp {
    public static void main(String[] args) {
        BackPack my_sac     = new BackPack(" XM");
        Laptop   laptop     = new Laptop(" Apple");
        Book     manual     = new Book(" ,,How not to brake Apple laptop,,");
        my_sac.addLaptop(laptop);
        my_sac.addBook(manual);
        System.out.println(my_sac);
        System.out.println("Acessories : " + "Laptop => " + laptop.brand + ";  Book => " + manual.title);
        //Tepochka
    }
}
class BackPack extends Accessories{
    String brand;
    float volume;
    byte pockets;
    byte sections;

    Laptop note_section;
    Book book_section;
    Thing thing_section;

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
    void addLaptop(Laptop t){
        this.note_section = t;
    }
    void addBook(Book t){
        this.book_section = t;
    }
    void removeLaptop(Laptop t){
        this.note_section = null;
    }

    public String toString(){
        return "BackPack (brand = " + brand + ", volume = " + volume + ", pockets = " + pockets + ", sections = " + sections + ")";
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
