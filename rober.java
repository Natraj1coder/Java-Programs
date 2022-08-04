public class rober {
    public int maxvalhouse(int []houses,int currindex){
        if(currindex>=houses.length){
         return 0;
        }
        int first= houses[currindex]+maxvalhouse(houses, currindex+2);
        int sec= maxvalhouse(houses, currindex+1);
        return Math.max(first,sec);
    }
}
