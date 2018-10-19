public class PolyMorhism {
    public static void main(String[] args){
        add(10,20);
        add(10.5f,20f);
    }
    public static void add(int a,int b){
        System.out.println("Integer sum: " + (a + b));
    }
    public static void add(float a,float b){
        System.out.println("Integer sum: " + (a + b));
    }
}
