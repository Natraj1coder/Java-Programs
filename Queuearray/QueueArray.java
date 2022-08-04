package Queuearray;

import java.util.Queue;

public class QueueArray {
    int arr[];
    int top;
    int begin;
    public QueueArray(int size){
        this.arr=new int[size];
        this.top=-1;
        this.begin=-1;
        System.out.println("Queue is created with size"+size);
    }
 
    public void enQueue(int val){
        if(isFull()){
            System.out.println("Queue is full");
            return ;
        }
        else if(isEmpty()){
           begin =0;
           top++;
           arr[top]=val;
           System.out.println("inserted"+val);

        }
        else{
            top++;
            arr[top]=val;
            System.out.println("inserted"+val);
        }
    }
    public int Deqeue(){
        if(isEmpty()){
            System.out.println("empty");
            return -1;
        }
        else{
            int result=arr[begin];
            begin++;
            if(begin>top){
               begin= top=-1;
            }
            return  result;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("empty");
            return -1;
        }
        else{
            return arr[begin];
        }
    }
    public Boolean isEmpty(){
        if(top==-1|| begin==arr.length){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(top==arr.length-1){
            return true;
        }
        return false;
    }
    public void delete(){
        arr=null;
        top=-1;
        System.out.println("deleted queue");
    }
    
}
