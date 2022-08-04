import java.util.Scanner;

 public class binary {
    static int findBin(int num){
        if(num==0){
            return 0;
        }
        return num%2+10*findBin(num/2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(findBin(n));
        sc.close();
    }
}

