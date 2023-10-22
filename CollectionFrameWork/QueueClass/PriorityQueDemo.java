package CollectionFrameWork.QueueClass;

// import java.util.Collections; Collections.reverseOrder()
import java.util.PriorityQueue;

public class PriorityQueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(20);
        pq.add(10);
        pq.add(60);
        pq.add(30);
        pq.add(50);
        pq.add(40);
        // pq.add(10);
        // pq.add(1);
        // pq.add(4);
        System.out.println(pq);
    }
}
