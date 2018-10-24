class Student implements StudentInterface{
    public static String name;
    public static String department;

    public void speak() {
        System.out.println("Hi");
    }
    public void write() {

    }
    public void read() {

    }
    Student(String name,String department){
        this.name = name;
        this.department = department;
    }
    public String toString(){
        return "" + name + " Learn at " + department;
    }
}