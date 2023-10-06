package CollectionImplementation.StackImplementationSingleLinkedList;

public class MainStackSingleLinkedList {
    public static void main(String[] args) {
        MyStackSingleLinkedList ssll = new MyStackSingleLinkedList();
        ssll.push(40);
        ssll.push(10);
        ssll.push(30);
        ssll.push(20);
        System.out.println(ssll); // 20<=30<=10<=40
        System.out.println(ssll.peek()); // 20
        System.out.println(ssll.size()); // 4
        System.out.println(ssll.pop()); //20
        System.out.println(ssll.pop()); //30
        System.out.println(ssll.pop()); //10
        System.out.println(ssll.pop()); //40
        System.out.println(ssll.pop()); // Stack is underflow
        System.out.println(ssll.size()); //0
        System.out.println(ssll); // 

    }
}
