public class ReturnApp {
    public static void main(String[] args){
        int result = simple(70,100,true);
        System.out.println(result);

    }
    public static int simple(int min,int max,boolean odd){
            return (int)(  (max-min) * Math.random() )+ min;
        }
    }

