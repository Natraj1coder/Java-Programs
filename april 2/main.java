public class main {
    public static void main(String[] args) {
        LinkedList lst=new LinkedList();
        lst.create(2);
        System.out.println(lst.head.value);
         lst.insert(3, 0);
        System.out.println(lst.head.value);
        lst.insert(4,1);
        lst.insert(5,1);
           
        lst.printList();
        System.out.println(lst.find(5));
        lst.delete(3);
        // System.out.println();
        lst.printList();
        lst.deleteAll();
        lst.printList();
    }
}
