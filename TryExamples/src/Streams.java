import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

//Scanner() <= FileInputStream/InputStream,File...)

public class Streams {
    public static void main(String[] args) {
        //new Scanner();
        Scanner in = new Scanner(System.in);

        String firstname;
        String lastname;
        int age;

        System.out.println("Firstname: ");
        firstname = in.next();
        System.out.println("Lastname: ");
        lastname = in.next();
        System.out.println("Age: ");
        try{
            age = in.nextInt();
            System.out.println("Data: " + firstname + "\n" + lastname + "\n" + age);
            FileWriter fw = new FileWriter("/home/krypt0n/Documents/data.txt");
            Scanner fr = new Scanner(new File("/home/krypt0n/Documents/data.txt"));
            fw.write(firstname + "" + lastname + "" + age);
            fw.close();
            System.out.println("Reading");
            String name = fr.next();
            System.out.println("Content in file " + name);
        }catch(InputMismatchException e){
            System.out.println("Error");
        } catch (IOException e) {
            System.err.println("File error");
        }
        //save to file


    }
}
