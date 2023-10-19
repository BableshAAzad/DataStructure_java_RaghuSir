package Practice;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // for (Integer i : q) {
        //     System.out.println(i);
        // }
        System.out.println(q.contains(4)); // true
    }
}
