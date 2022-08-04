import java.util.*;

public class reversearray {
    static void Reverse(int[]arr){
    for(int i=0;i<arr.length/2;i++){
        int other=arr.length-i-1;
        int temp=arr[i];
        arr[i]=arr[other];
        arr[other]=temp;
    
    }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        Reverse(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
