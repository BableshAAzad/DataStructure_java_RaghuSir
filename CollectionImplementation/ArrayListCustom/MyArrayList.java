package CollectionImplementation.ArrayListCustom;

public class MyArrayList {
    int capacity, intial;
    Object[] obj;

    MyArrayList(int capacity) {
        this.capacity = capacity;
        obj = new Object[capacity];
        intial = -1;
    }
//----------------------------------------------------
    void add(Object ele) {
        if (intial == capacity) {
            System.out.println("ArrayList is full");
            return;
        }
        obj[++intial] = ele;
    }
//----------------------------------------------------
    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i <= intial; i++) {
            str = str + obj[i];
            if (i < intial)
                str = str + ",";
        }
        return str + "]";
    }
//----------------------------------------------------
    public int size() {
        return intial + 1;
    }
//----------------------------------------------------
    public Object get(int i) {
        if (intial == -1) {
            System.out.println("ArrayList is empty");
            return null;
        }
        return obj[i];
    }
//----------------------------------------------------
    public boolean contains(Object o) {
        for (int i = 0; i < intial; i++) {
            if (o == obj[i])
                return true;
        }
        return false;
    }
//----------------------------------------------------
    public Object remove(int n) {
        Object temp = null;
        if (n < 0 || n > intial) {
            System.out.println("Index is outoff range");
            return 0;
        }
        if (intial == -1) {
            System.out.println("ArrayList is empty");
            return null;
        }
        if (n == 0)
            temp = obj[0];
        for (int i = 0; i < intial; i++) {
            if (i == n)
                temp = obj[n];
            if (i < n)
                obj[i] = obj[i];
            else
                obj[i] = obj[i + 1];
        }
        intial--;
        return temp;
    }
//----------------------------------------------------
    public void clear() {
        intial = 0;
    }
//----------------------------------------------------
    public boolean isEmpty() {
        if (intial == -1)
            return true;
        else
            return false;
    }
//----------------------------------------------------

}
