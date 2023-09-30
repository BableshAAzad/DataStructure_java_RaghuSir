package CollectionsClasses.DoubleLinkedListCustom;

public class DoublyLinkedList {
    class Node {
        Object data;
        Node prev;
        Node next;

        Node(Object data) {
            this.data = data;
        }
    }

    // ---------------------------------
    Node head;

    public void add(Object ele) {
        Node n = new Node(ele);
        if (head == null) {
            head = n;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        n.prev = temp;
        temp.next = n;
    }

    // ---------------------------------
    public void addFirst(Object ele) {
        Node n = new Node(ele);
        if (head == null) {
            head = n;
            return;
        }
        head.prev = n;
        n.next = head;
        head = n;
    }

    // -----------------------------------
    public String toString() {
        String str = "";
        Node temp = head;
        while (temp != null) {
            str = str + temp.data;
            if (temp.next != null) {
                str = str + "<=>";
            }
            temp = temp.next;
        }
        return str;
    }

    // ------------------------------------
    public void add(Object ele, int in) {
        if (in == 0) {
            addFirst(ele);
            return;
        }
        Node temp = head;
        while (temp != null && in > 1) {
            temp = temp.next;
            in--;
        }
        if (temp == null) {
            System.out.println("Index not in range");
            return;
        }
        Node n = new Node(ele);
        n.next = temp.next;
        n.prev = temp;
        temp.next = n;
        if (n.next != null)
            n.next.prev = n;
    }

    // -------------------------------------
    public Object deleteFirst() {
        if (head == null) {
            return "List is empty";
        }
        Object data = head.data;
        head = head.next;
        if (head != null)
            head.prev = null;
        return data;
    }

    // ------------------------------------
    public Object deletLast() {
        if (head == null)
            return "List is empty";
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        if (temp.prev != null)
            temp.prev.next = null;
        else
            head = null;
        return temp.data;
    }

    // --------------------------------------
    public Object delete(int in) {
        if (in == 0)
            return deleteFirst();
        Node temp = head;
        while (temp != null && in > 0) {
            temp = temp.next;
            in--;
        }
        if (temp == null)
            return "Index not in the range";
        temp.prev.next = temp.next;
        if (temp.next != null)
            temp.next.prev = temp.prev;
        return temp.data;
    }

    // --------------------------------------
    public void reverse() {
        Node temp = head;
        Node prev;
        while (temp != null) {
            prev = temp.next;
            temp.next = temp.prev;
            temp.prev = prev;
            if (prev != null)
                temp = prev;
            else {
                head = temp;
                return;
            }
        }
    }
}
