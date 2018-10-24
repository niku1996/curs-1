class Master implements StudentInterface{
    public static String name;
    public static String department;

    public void speak() {
        System.out.println("Hi");
    }
    public void write() {
        System.out.println("I can write in Spanish,English,Romanian and Russian");
    }
    public void read() {
        System.out.println("I can read in Spanish,English,Romanian and Russian");
    }
    Master(String name,String department){
        this.name = name;
        this.department = department;
    }
    public String toString(){
        return "" + name + " Learn at " + department;
    }
}
