package CirDoubly;

public class Cirop {
    CirNode head;
    CirNode tail;
    public int size;
    public void createCir(int ele){
        CirNode node =new CirNode();
        node.data=ele;
        node.next=node;
        node.prev=node;
        head=node;
        tail=node;
        size=1;
    }
    
}
