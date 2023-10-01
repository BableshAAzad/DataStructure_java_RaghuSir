package CollectionsClasses.TreeCustom;

public class MyTreeC {
    Object data;
    class Node {
        Object right, left;

        Node(Object data) {
            this.data = data;
        }
    }

    boolean add(Object data) {
        if (this.data.compareTo(data) == 0) {
            return false;
        }
    }
}
