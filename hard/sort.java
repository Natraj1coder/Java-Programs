package hard;
// { Driver Code Starts
    import java.util.*;
    
    class Pair
    {
        int x;
        int y;
        
        public Pair(int a, int b)
        {
            x = a;
            y = b;
        }
    }
    
    class Chainlength
    {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            
            while(t-- > 0)
            {
                int n = sc.nextInt();
                Pair pr[] = new Pair[n];
                int arr[] = new int[2*n];
                for(int i = 0; i < 2*n; i++)
                {
                   arr[i] = sc.nextInt();
                }
                sc.close();
                for(int i = 0, j = 0; i < 2*n-1 && j < n; i = i+2, j++)
                {
                    pr[j] = new Pair(arr[i], arr[i+1]);
                }
                GfG g = new GfG();
                System.out.println("Chain length "+g.maxChainLength(pr, n));
            }
        }
    }
    // } Driver Code Ends
    
    
    /*class CompareByFirst implements Comparator<Pair>
    {
       public int compare(Pair a, Pair b)
        {
            return a.x - b.x;
        }
    }*/
    
    class GfG
    {
        int maxChainLength(Pair arr[], int n)
         {
             
          Arrays.sort(arr,(a,b)->(a.x - b.y));
          for(int i=0;i<arr.length;i++){
              System.out.println(arr[i].x+" "+arr[i].x);
          }
        //   int p1=arr[0].y;
        //   int count=1;
        //   for(int i=1;i<arr.length;i++){
        //       if(arr[i].x > p1){
        //           p1=arr[i].y;
        //           count++;
        //       }
        //   }
          return 0;
       }
    }