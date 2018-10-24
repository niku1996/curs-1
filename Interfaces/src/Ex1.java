public class Ex1 {
    public static void main(String[] args) {
        Student max = new Student("Max"," CEEE ");
        Master ivan = new Master("Ivan"," CEEE ");
        University obj= new University(max,ivan);
        System.out.println(obj);
    }
}
interface StudentInterface{
    public void speak();
    public void write();
    public void read();
}