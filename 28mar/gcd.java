import java.util.Scanner;

public class gcd {
    static int findGCD(int n1,int n2){
        // System.out.println(n1+" "+n2);
        if(n2==0){
            return n1;
        }
        else{
            return findGCD(n2, n1%n2);
        }
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Ans "+findGCD(num1, num2));
        sc.close();
    }
}
