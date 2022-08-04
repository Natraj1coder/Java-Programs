public class Numberfactor{
public int waystoGetN(int n){
    if(n==0||n==1||n==2) return 1;
    if(n==3){
        return 2;
    }
    int sub1=waystoGetN(n-1);
    int sub2=waystoGetN(n-3);
    int sub3=waystoGetN(n-4);
    return sub1+sub2+sub3;
}
}