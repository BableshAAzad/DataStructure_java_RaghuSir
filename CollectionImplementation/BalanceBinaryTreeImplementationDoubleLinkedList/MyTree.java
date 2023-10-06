package CollectionImplementation.BalanceBinaryTreeImplementationDoubleLinkedList;

public class MyTree {
    class Node {
        Object data;
        Node left;
        Node right;

        Node(Object data) {
            this.data = data;
        }
    }

    // ---------------------------------------------------
    Node root;

    boolean add(Comparable data) {
        if (root == null) {
            root = new Node(data);
            return true;
        }
        return add(root, data);
    }

    // ----------------------------
    boolean add(Node rt, Comparable data) {
        if (data.compareTo(rt.data) == 0)
            return false;
        if (data.compareTo(rt.data) > 0) {
            if (rt.right == null) {
                rt.right = new Node(data);
                return true;
            }
            return add(rt.right, data);
        } else {
            if (rt.left == null) {
                rt.left = new Node(data);
                return true;
            }
            return add(rt.left, data);
        }
    }

    // ------------------------------------------------------
    public void display() {
        System.out.println("---------inOrder----------");
        inOrder(root);
        System.out.println("\n---------preOrder---------");
        preOrder(root);
        System.out.println("\n---------postOrder--------");
        postOrder(root);
    }

    // --------------------------
    void inOrder(Node rt) {
        if (rt == null)
            return;
        // System.err.print(rt.data + " ");
        inOrder(rt.left);
        System.out.print(rt.data + " ");
        inOrder(rt.right);
        // System.err.print(rt.data + " ");
    }

    // --------------------------
    void preOrder(Node rt) {
        if (rt == null)
            return;
        System.out.print(rt.data + " ");
        preOrder(rt.left);
        preOrder(rt.right);
    }

    // ---------------------------
    void postOrder(Node rt) {
        if (rt == null)
            return;
        postOrder(rt.left);
        postOrder(rt.right);
        System.out.print(rt.data + " ");
    }

    // ----------------------------------------------------------
    int size() {
        return size(root, 0);
    }

    int size(Node rt, int count) {
        if (rt == null)
            return count;
        count++;
        count = size(rt.left, count);
        count = size(rt.right, count);
        return count;
    }
}
