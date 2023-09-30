package CollectionsClasses.QueueCustom;

public class MyQue {
    Object[] obj;
    int capacity, front, rear;

    MyQue(int capacity) {
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
        String str = "[";
        for (int i = front; i <= rear && i >= 0; i++) {
            str = str + obj[i];
            if (i < rear)
                str = str + ",";
        }
        return str + "]";
    }

    public Object deque() {
        if (front == -1) {
            System.out.println("Queue is empty.....");
            return null;
        }
        Object ele = obj[front++];
        if (front > rear)
            rear = front = -1;
        return ele;
    }
}
