package SingleLindedListCustom;

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
    }
}
