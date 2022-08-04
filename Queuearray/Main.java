package Queuearray;

import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        QueueArray queue=new QueueArray(5);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        System.out.println(queue.Deqeue());
        queue.delete();
        System.out.println(queue.peek());
    }
}
