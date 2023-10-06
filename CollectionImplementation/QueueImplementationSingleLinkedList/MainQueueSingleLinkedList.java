package CollectionImplementation.QueueImplementationSingleLinkedList;

public class MainQueueSingleLinkedList {
    public static void main(String[] args) {
        MyQueueSingleLinkedList qsll = new MyQueueSingleLinkedList();
        qsll.enQue(40);
        qsll.enQue(10);
        qsll.enQue(30);
        qsll.enQue(20);
        System.out.println(qsll); // 40=>10=>30=>20
        System.out.println(qsll.peek());
        System.out.println("Size of the queue is : " + qsll.size()); // 4
        System.out.println(qsll.deQue()); // 40
        System.out.println(qsll.deQue()); // 10
        System.out.println(qsll.deQue()); // 30
        System.out.println(qsll.deQue()); // 20
        System.out.println(qsll.deQue()); // Queue is empty
    }
}
