package CollectionImplementation.StackCustom;

public class MyStack {
    int capacity, top;
    Object[] obj;

    MyStack(int capacity) {
        this.capacity = capacity;
        obj = new Object[capacity];
        top = -1;
    }

    void push(Object ele) {
        if (top == capacity - 1) {
            System.out.println("Stack is overflow.....");
            return;
        }
        obj[++top] = ele;
    }

    public String toString() {
        String str = "[";
        for (int i = 0; i <= top; i++) {
            str = str + obj[i];
            if (i < top)
                str = str + ",";
        }
        return str + "]";
    }

    int size() {
        return top + 1;
    }

    public Object pop() {
        if (top == -1) {
            System.out.println("Stack is underflow.....");
            return null;
        }
        return obj[top--];
    }

    public Object peek() {
        if (top == -1) {
            System.out.println("Stack is underflow.....");
            return null;
        }
        return obj[top];
    }

    public int search(Object ele) {
        for (int i = 0; i <= top; i++) {
            if (obj[i].equals(ele))
                return top - i + 1;
        }
        return 0;
    }

    public boolean empty() {
        if (top == -1)
            return true;
        else
            return false;
    }
}
