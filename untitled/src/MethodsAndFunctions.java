public class MethodsAndFunctions {
    public static void main(String [] args){

        hi(4);
        bye(3);
    }
    public static void hi(int n){
        for (; n !=0 ; --n ){
            System.out.println("Hello, Java!");
        }

    }
    public static void bye(int n){
        do {
            System.out.println("Bye, Java!");
        }while (--n !=0);

    }
}
//function can be called,can have parameters,can return something,
    //1. dry => don't repeat your self
    //2. separation of concerns

//