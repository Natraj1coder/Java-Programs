

public class Circular {
    public Node head;
    public Node tail;
    public int size;
    public Node create(int data){
        Node node =new Node();
        node.value=data;
        node.next=node;
        head=node;
        tail=node;
        size=  1;
        return head;
    }
    public void insert(int ele,int pos){
        Node node =new Node();
        node.value=ele;
        if(head==null){
            create(ele);
            return ;
        }
        else if(pos==0){
            node.next=head;
            head=node;
            tail.next=head;
        }
        else if(pos>=size){
            tail.next=node;
            tail=node;
           tail.next=head;
        }
        else{
            int i=0;
            Node currNode=head;
            while(i<pos-1){
                currNode =currNode.next;
                i++;
            }
            node.next=currNode.next;
            currNode.next=node;
        }
        size++;
    }
    public void PrintList(){
        if (head != null) {
            Node tempNode = head;
            for (int i=0; i<size; i++) {
              System.out.print(tempNode.value);
              if (i != size-1) {
                System.out.print(" -> ");
              }
              tempNode = tempNode.next;
            }
            System.out.println("\n");
          } else {
            System.out.println("\nCSLL does not exist!");
          }
        }
        public boolean find(int num){
            if(head!=null){
                Node currnNode=head;
                for(int i=0;i<size;i++){
                        if(currnNode.value==num){
                            return true;
                        }
                        currnNode=currnNode.next;
                }

            }
            else{

                System.out.println("Empty");
            }
            return false;        }
        public void delete(int loc ){
               if(head==null){
                   System.out.println("empty");
                   return ;
               }
               else if(loc==0){
                   head=head.next;
                   tail.next=head;
                   size--;
                   
                   if(size==0){
                       head.next=null;
                       head=null;
                       tail=null;
                   } 
               }
               else if(loc>=size){
                   Node tempNode=head;
                   for(int i=0;i<size-1;i++){
                       tempNode=tempNode.next;
                   }
                   if(tempNode.next==head){
                head.next=null;
                size--;
                 head =null;
                 return ;
                 }
                 tempNode.next=head;
                 tail=tempNode;
                 size--;
               }
               else{
                   Node tempNode=head;
                   for(int i=0;i<loc-1;i++){
                       tempNode=tempNode.next;
                   }
                   tempNode.next=tempNode.next.next;
                   size--;
               }

               
        }

        public void deleteall() {
            if(head==null){
                System.out.println("Already Empty");
                return ;
            }
            head=null;
            tail.next=null;
            tail=null;
            System.out.println("Sucessfully deleted the entire list");

        }
}
