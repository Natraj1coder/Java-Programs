public class cirmain {
    public static void main(String[] args) {
        Circular lst=new Circular();
        lst.create(1);
        lst.insert(2, 0);
        System.out.println(lst.head.value);
        System.out.println(lst.head.next.value);
        System.out.println(lst.head.next.next.value);
        lst.insert(3, 2);
        
        lst.insert(5, 2);
        lst.insert(6, 3);
        lst.insert(7, 4);
        System.out.print(lst.head.value+" "+lst.head.next.value+" "+lst.head.next.next.value+" "+lst.head.next.next.next.value+" "+lst.head.next.next.next.next.value+" "+lst.head.next.next.next.next.next.value+
        " "+lst.head.next.next.next.next.next.next.value);
        System.out.println();
        lst.PrintList();
        lst.insert(3, 1);
        lst.PrintList();
        System.out.println( lst.find(2));
        lst.delete(2);
        lst.PrintList();
        lst.delete(5);
        lst.deleteall();
        lst.PrintList();

        
    }
}
