import java.util.Scanner;

public class quiersonstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int row=2;
        int [][]quers=new int[row][2];
        for(int i=0;i<row;i++){
            for(int j=0;j<2;j++){
                quers[i][j]=sc.nextInt();
            }
        }
        Solution sol=new Solution();
        int []arr=sol.getSolution(str,quers);
    }
}
class Solution
{
    // static int countdist(String str,int strt,int end){
    //     HashSet<Character> hs=new 
    // }
    public int[] SolveQueris(String str, int[][] Query)
    {
        System.out.println(Query.length);
        // for(int i=0;i<Query.length;i++){
        //     for(int j=0;j<2;j++){
                
        //     }
        // }
        return new int[2];
    }
}
