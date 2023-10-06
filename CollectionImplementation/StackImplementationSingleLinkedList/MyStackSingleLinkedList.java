package CollectionImplementation.StackImplementationSingleLinkedList;

public class MyStackSingleLinkedList {
    class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
        }
    }

    // --------------------------------------------
    Node top;
    int count = 0;

    public void push(Object data) {
        Node n = new Node(data);
        n.next = top;
        top = n;
        count++;
    }

    // -----------------------------------------
    public Object peek() {
        if (top == null)
            return "Stack is underflow";
        else
            return top.data;
    }

    // ----------------------------------------
    public Object pop() {
        if (top == null)
            return "Stack is underflow";
        Object data = top.data;
        top = top.next;
        count--;
        return data;
    }

    // -----------------------------------------
    @Override
    public String toString() {
        String str = "";
        Node temp = top;
        while (temp != null) {
            str = str + temp.data;
            if (temp.next != null)
                str = str + "<=";
            temp = temp.next;
        }
        return str;
    }

    // ------------------------------------------
    public int size() {
        return count;
    }
}
