package asfar;

import java.util.*;

public class graph {
public int maxdistance(int [][]grid){
    int [][]direction={{0,1},{1,0},{0,-1},{-1,0}};
    Queue<int []>q=new LinkedList<int[]>(); 
    int rows=grid.length;
    int cols=grid[0].length;
    Set<String> vist=new HashSet<String>();
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            if(grid[i][j]==1){
            int []arr= new int[2];
                 arr[0]=i;
                arr[1]=j;
                q.offer(arr);
                grid[i][j]=-1;
            }
        }
    }
    int steps=0;
    while(!q.isEmpty()){
        steps++;
        int qsize=q.size();
        for(int i=0;i<qsize;i++){
            int []index=q.poll();
            int x=index[0];
            int y=index[1];
            for(int j=0;j<4;j++){
                int newX=direction[i][0];
                int newY=direction[i][1];
                if(!isValid(newX,newY,grid)){
                    continue;
                }
                if(grid[x][y]==-1){
                    continue;
                }
                int [] newarr=new int[2];
                newarr[0]=newX;
                newarr[1]=newY;
                q.offer(newarr);

            }
        }
    }
    return steps==0?-1:steps;
}
private  boolean isValid(int i,int j,int[][] grid ){
if(i<0||i>=grid.length|j<0||j>=grid[0].length){
return false;
}
return grid[i][j]==0;
}    
}
