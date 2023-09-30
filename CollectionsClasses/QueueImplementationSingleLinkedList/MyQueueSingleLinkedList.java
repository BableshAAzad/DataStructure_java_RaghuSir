package CollectionsClasses.QueueImplementationSingleLinkedList;

public class MyQueueSingleLinkedList {
    class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
        }
    }

    // ---------------------------------------
    Node front, rear;
    int count;

    void enQue(Object data) {
        Node n = new Node(data);
        count++;
        if (front == null)
            front = n;
        else
            rear.next = n;
        rear = n;
    }

    // -----------------------------------------
    Object deQue() {
        if (front == null)
            return "Queue is empty";
        Object data = front.data;
        front = front.next;
        if (front == null)
            rear = null;
        count--;
        return data;
    }

    // -----------------------------------------
    @Override
    public String toString() {
        String str = "";
        Node temp = front;
        while (temp != null) {
            str = str + temp.data;
            if (temp.next != null)
                str = str + "=>";
            temp = temp.next;
        }
        return str;
    }

    public int size() {
        return count;
    }

    // -------------------------------------------
    public Object peek() {
        if (front == null)
            return "Queue is underflow";
        else
            return front.data;
    }
}
