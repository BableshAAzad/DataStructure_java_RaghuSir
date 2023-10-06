package CollectionImplementation.SingleLindedListCustom;

public class SingleLinkedList {
    class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
        }
    }

    // --------------------------------------
    Node head;

    void add(Object data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
    }

    // ---------------------------------------
    public String toString() {
        String str = "";
        Node temp = head;
        while (temp != null) {
            str = str + temp.data;
            if (temp.next != null)
                str = str + "->";
            temp = temp.next;
        }
        return str;
    }

    // --------------------------------------
    void addFirst(Object data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    // --------------------------------------
    void add(int data, int in) {
        if (in == 0) {
            addFirst(data);
            return;
        }
        Node temp = head;
        while (in > 1 && temp.next != null) {
            in--;
            temp = temp.next;
        }
        if (in == 1) {
            Node n = new Node(data);
            n.next = temp.next;
            temp.next = n;
            return;
        } else
            System.err.println("Index not in the range");
    }

    // ----------------------------------------
    public Object deleteFirst() {
        if (head == null)
            return "No element in the list";
        Object data = head.data;
        head = head.next;
        return data;
    }

    // -----------------------------------------
    public Object deleteLast() {
        if (head == null)
            return "No element in the list";
        Node temp = head;
        Node prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        if (prev != null)
            prev.next = null;
        else
            head = null;
        return temp.data;
    }

    // ------------------------------------------
    public Object delete(int in) {
        if (in == 0)
            return deleteFirst();
        Node temp = head;
        while (in > 1 && temp.next != null) {
            in--;
            temp = temp.next;
        }
        if (temp.next == null)
            return "Index not in the range";
        else {
            Object data = temp.next.data;
            temp.next = temp.next.next;
            return data;
        }
    }

    // ------------------------------------------
    public int sum() {
        int total = 0;
        Node temp = head;
        while (temp != null) {
            total = total + (Integer) temp.data;
            temp = temp.next;
        }
        return total;
    }

    // ------------------------------------------
    void printReverseOrder(Node first) {
        if (first == null)
            return;
        printReverseOrder(first.next);
        System.out.println(first.data);
    }

    // ------------------------------------------
    void revers() {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
}
