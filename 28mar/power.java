import java.util.Scanner;

public class power {
    static int pow(int n,int pow){
        if(pow==0){
            return 1;
        }
        else{
            return n*pow(n, pow-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int pow=sc.nextInt();
        num n=new num();
       System.out.print( n.power(num, pow));
    //    System.out.print( pow(num, pow));
        sc.close();
    }

}
class num {
    public int power(int n,int pow){
        if(pow==0){
            return 1;
        }
        else{
            return n*power(n, pow-1);
        }

    }
}
