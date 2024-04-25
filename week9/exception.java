import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ExceptionHand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            FileInputStream fis = new FileInputStream("text1.txt");
            int a=fis.read();
            System.out.println(a);
            System.out.println((char)a);
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
        catch(IOException e){
            System.out.println("Input Output exception");
        }
        try {
            Class.forName("Lavanya");
        } catch (ClassNotFoundException e) {
            System.out.println("class is not found");
        }
        int a=10, b=0;
        try {
            int res=a/b;
        } catch (ArithmeticException e) {
            System.out.println("Any number cant divide by zero");
        }
        try {
            String a1="hello";
            System.out.println(a1.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
           System.out.println("string index is out of range");
        }
        try {
            String a2=null;
            System.out.println(a2.length());
        } catch (NullPointerException e) {
            System.out.println("pointing to the NUll");
        }
        try {
            int arr[]={1,2,3,4};
            System.out.println(arr[19]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range");
        }
        sc.close();
    }
    
}
