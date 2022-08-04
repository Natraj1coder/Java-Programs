public class LinkedList {
   public  Node head;
   public Node tail;
   public int size;
   public  Node create(int data){
       Node node=new Node();
       head=node;
       node.next=null;
       node.value=data; 
       head=node;
       tail=node;
       size=1;
       return head;
   }
   public  void printList(){
       if(head==null){
           System.out.println("empty");
       }
       else{
           Node tempNode=head;
       while(tempNode.next!=null){
           System.out.print(tempNode.value+" ");
           tempNode=tempNode.next;

       }
       }
       System.out.println();
       
   }
   public void insert(int val,int pos){
    Node node=new Node();
    node.value=val;
    if(head==null){
        create(val);
        return ;
    }
    else if(pos==0){
        node.next=head;
        head=node;
    }
    else if(pos>=size){
        node.next=null;
        tail.next=node;
        tail=node;
        
    }
    else{ //between
        Node tempNode =head;
        int i=0;
        while(i<pos-1){
           tempNode= tempNode.next;
           i++;
        }
        // Node nextNode=tempNode.next;
        // tempNode.next=node;
        // node.next=nextNode;
        node.next=tempNode.next;
        tempNode.next=node;
    }
    size++;
   }
  public boolean find(int ele){
    Node tempNode=head;
    while(tempNode.next!=null){
        if(tempNode.value==ele){
            return true;
        }
        tempNode=tempNode.next;
    } 
    return false;

   }
   public void delete(int ele){
       if(size==1){
        head=null;
        tail=null;
        size--;
       }
       else if(head.value==ele){
           Node tempNode=head;
           head=tempNode.next;
           size--;
       }
       else{
       Node tempNode=head;
       while(tempNode.next!=null){
           
           if(tempNode.next.value==ele){
               break ;
           }
           tempNode=tempNode.next;
       }
       size--;
       if(tempNode.next.next==null){
           tempNode.next=null;
       }
       else{
       tempNode.next=tempNode.next.next;
       }
    }

   }
   public void deleteAll(){
        head=null;
        tail=null;
   }
  
}
