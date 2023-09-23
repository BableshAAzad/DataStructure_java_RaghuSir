package SingleLindedListCustom;

public class SingleLinkedList {
    class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
        }
    }

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

    void addFirst(Object data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }
}
