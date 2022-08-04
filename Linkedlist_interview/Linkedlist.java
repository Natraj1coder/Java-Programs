package Linkedlist_interview;

import java.util.HashSet;

public class Linkedlist {
    public node head;
    public node tail;
    public int size;

    public void createLL(int val)
    {
        node newNode=new node();
        newNode.value=val;
        newNode.next=null;
        head=newNode;
        tail=newNode;
        size=1;
    }
    public void insert(int val){
        if(head==null){
            createLL(val);
            return ;
        }
        node newNode=new node();
        newNode.value=val;
        newNode.next=null;
        tail.next=newNode;
        tail=newNode;
        size++;
    }
    public void Traversal(){
        node tempNode=head;
        for(int i=0;i<size;i++){
            System.out.print(tempNode.value);
            if(i!=size-1){
                System.out.print("->");
            }
            tempNode=tempNode.next;
        }
        System.out.println();
    }
   public void deleteAt(int loc){
    node tempNode=head;
    int i=0;
    while(i<loc-1){
        // System.out.println("inter"+tempNode.value);
          tempNode=tempNode.next;
          i++;
    }
    tempNode.next=tempNode.next.next;
    size--;
   }

    public void deleteDup(){
        HashSet<Integer> hs=new HashSet<>();
        node tempNode1=head;
        node prev=null;
        while(tempNode1!=null){
            int curr=tempNode1.value;
            if(hs.contains(curr)){
               prev.next=tempNode1.next;
               size--;
            }
            else{
                hs.add(curr);
                prev=tempNode1;
            }
           tempNode1=tempNode1.next;
        }
    }
    public void nthformlast(int n){
        node p1=head;
        int i=0;
        node p2=head;
        while(i<n-1){
            p2=p2.next;
            i++;
        }
        while(p2.next!=null){
            p1=p1.next;
            p2=p2.next;
        }
        while(p1!=null){
            System.out.print(p1.value);
            if(p1.next!=null){
                System.out.print("->");
            }
            p1=p1.next;
        }
        System.out.println();

    }

    Linkedlist partion(Linkedlist ll,int x){
      node currNode=ll.head;
      ll.tail=ll.head;
      while(currNode!=null){
          node next=currNode.next;
          if(currNode.value<x){
              currNode.next=ll.head;
              ll.head=currNode;
          }
          else{
              ll.tail.next=currNode;
              ll.tail=currNode;
          }
          currNode=next;
      }
      ll.tail.next=null;
      return ll;
    }
    //QUestion4 
    Linkedlist sumList(Linkedlist lla,Linkedlist llb){
        node n1=lla.head;
        node n2=llb.head;
        int carry=0;
        Linkedlist resultLL=new Linkedlist();
        while(n1!=null||n2!=null){
            int result=carry;
            if(n1!=null){
                result+=n1.value;
                n1=n1.next;
            }
            if(n2!=null){
                result+=n2.value;
                n2=n2.next;
            }
            resultLL.insert(result%10);
            carry=result/10;
        }
        // resultLL.Traversal();
        return resultLL;

    }

}
