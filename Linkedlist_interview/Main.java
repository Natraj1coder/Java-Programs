package Linkedlist_interview;

public class Main {
    public static void main(String[] args) {
     Linkedlist lst=new Linkedlist();
     lst.createLL(1);
     lst.insert(2);
     lst.insert(2);
     lst.insert(3);
     lst.insert(3);
     lst.Traversal();   
     lst.deleteDup();
     lst.Traversal();
    //  //Question 2
    // //  lst.nthformlast(4);
    //  //Question 3
    //  lst.partion(lst, 3);
    //  lst.Traversal();
     System.out.println();
     Linkedlist lst2=new Linkedlist();
     lst2.insert(9);
     lst2.insert(3);
    lst2.insert(7);
    lst2.insert(4);
    lst2.Traversal();
    lst2.sumList(lst, lst2).Traversal();
    }
   
}
