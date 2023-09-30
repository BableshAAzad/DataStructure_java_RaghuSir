package CollectionsClasses.SingleLindedListCustom;

public class MainSingleLinkedList {
    public static void main(String[] args) {
        SingleLinkedList sl = new SingleLinkedList();
        sl.add(56);
        sl.add(89);
        sl.add(35);
        sl.add(28);
        sl.add(46);
        System.out.println(sl); // 56->89->35->28->46
        sl.addFirst(29);
        System.out.println(sl); // 29->56->89->35->28->46
        sl.add(57, 2);
        System.out.println(sl); // 29->56->57->89->35->28->46
        System.out.println(sl.deleteFirst()); // 29
        System.out.println(sl); // 56->57->89->35->28->46
        System.out.println(sl.deleteLast()); // 46
        System.out.println(sl); // 56->57->89->35->28
        System.out.println(sl.delete(3)); // 35  put index posision
        System.out.println(sl); // 56->57->89->28
        System.out.println(sl.sum()); // 230\
        // sl.printReverseOrder(0);
        sl.revers(); // reversed
        System.out.println(sl); // 28->89->57->56
    }
}
