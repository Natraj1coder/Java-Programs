import java.util.ArrayList;
import java.util.Scanner;

public class Avgtemp {
    public static void main(String[] args) {
        ArrayList<Integer> lst=new ArrayList<>();
        lst.contains(1);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        sc.close();
        double avg=(float)sum/n;
        System.out.println(avg);
        for(int i=0;i<n;i++){
            
        }
    }
}
