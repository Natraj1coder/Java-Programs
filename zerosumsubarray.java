
    // { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */


import java.util.*;
public class zerosumsubarray {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);

		    int n;
		    n=sc.nextInt();
		    
		    long arr[]=new long[n];
	
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextLong();
		    }
		    System.out.println(Solution.findSubarray(arr,n));
	
        sc.close();
		
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
     {
       long sum=0,count=0;
       HashMap<Long,Long> hs=new HashMap<>();
       hs.put(0L,1L);
       for(int i=0;i<n;i++)
       {sum+=arr[i];
       long x=hs.getOrDefault(sum,0L);
       System.out.println(x);
       count+=x;
       hs.put(sum,x+1);
       }
       System.out.println(hs);
       return count;
   }
}
