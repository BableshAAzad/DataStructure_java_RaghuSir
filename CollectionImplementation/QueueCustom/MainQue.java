package CollectionImplementation.QueueCustom;

public class MainQue {
    public static void main(String[] args) {
        MyQue mq = new MyQue(5);
        mq.enque(34);
        mq.enque(45);
        mq.enque(56);
        mq.enque(78);
        mq.enque(87);
        // mq.enque(67); // Queue is full..... not add this one becouse size is 5
        System.out.println(mq); // [34,45,56,78,87]
        System.out.println(mq.deque()); // 34
        System.out.println(mq.deque()); // 45
        System.out.println(mq); // [56,78,87]
        System.out.println(mq.deque()); // 56
        System.out.println(mq.deque()); // 78
        System.out.println(mq.deque()); // 87
        System.out.println(mq.deque()); // Queue is empty..... null
        System.out.println(mq); // []
    }
}
