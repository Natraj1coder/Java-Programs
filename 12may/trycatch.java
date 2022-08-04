import java.util.*;
public class trycatch {
    public static void main(String[] args) {
        try{
            int a=10;
            int b=0;
            a=a/b;
            System.out.println("hi");
        }
        catch(ArithmeticException){
            System.out.println("arithmetic exception");
        }
        finally{
            System.out.println("final");
        }
    }
}
