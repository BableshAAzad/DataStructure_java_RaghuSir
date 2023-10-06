package CollectionImplementation.DoubleLinkedListCustom;

public class MainDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.add(40);
        dll.add(10);
        dll.add(30);
        dll.add(20);
        System.out.println(dll); // 40<=>10<=>30<=>20
        dll.addFirst(25);
        System.out.println(dll); // 25<=>40<=>10<=>30<=>20
        dll.add(35, 2);  //  put object, index number
        System.out.println(dll); // 25<=>40<=>35<=>10<=>30<=>20
        System.out.println(dll.deleteFirst()); // 25
        System.out.println(dll); // 40<=>35<=>10<=>30<=>20
        System.out.println(dll.deletLast()); // 20
        System.out.println(dll); // 40<=>35<=>10<=>30
        System.out.println(dll.delete(1)); // 35 put index value
        System.out.println(dll); // 40<=>10<=>30
        dll.reverse();  // Double LinkedList is reversed
        System.out.println(dll); // 30<=>10<=>40
    }
}
