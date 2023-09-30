package CollectionsClasses.StackImplimentationSingleLinkedList;

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
    public Object peek(){
      if(top== null)
        return "Stack is underflow";
      else 
        return top.data;
    }
}
