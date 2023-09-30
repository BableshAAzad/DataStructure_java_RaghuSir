package CollectionsClasses.StackCustom;

public class MainStack {
    public static void main(String[] args) {
        MyStack ms = new MyStack(5);
        ms.push(24);
        ms.push(56);
        ms.push(34);
        ms.push(26);
        ms.push(48);
        System.out.println(ms); // [24,56,34,26,48]
        System.out.println(ms.size()); // 5
        System.out.println(ms.pop()); // 48
        System.out.println(ms.pop()); // 26
        System.out.println(ms); // [24,56,34]
        System.out.println(ms.size()); // 3
        System.out.println(ms.peek()); // 34
        System.out.println(ms.search(34)); // 1
        System.out.println(ms.search(56)); // 2
        System.out.println(ms.search(24)); // 3
        System.out.println(ms.empty());
    }
}
