package QueueCustom;

public class MyQue2 {
    Object[] obj;
    int capacity, front, rear;

    MyQue2(int capacity) {
        this.capacity = capacity;
        obj = new Object[capacity];
        rear = front = -1;
    }

    public void enque(Object ele) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full.....");
            return;
        }
        if (front == -1)
            front = 0;
        obj[++rear] = ele;
    }

    public String toString() {
        if (front == -1) {
            return "[]"; // Queue is empty
        }
        StringBuilder str = new StringBuilder("[");
        for (int i = front; i <= rear; i++) {
            str.append(obj[i]);
            if (i < rear)
                str.append(",");
        }
        str.append("]");
        return str.toString();
    }

    public Object deque() {
        if (front == -1) {
            System.out.println("Queue is empty.....");
            return null;
        }
        Object ele = obj[front];
        if (front == rear) {
            front = rear = -1; // Queue is now empty
        } else {
            front++;
        }
        return ele;
    }
}

