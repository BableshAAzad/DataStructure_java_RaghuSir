package Practice;

public class Demo3 {
    static void m1(int a) {
        System.out.println(a + " aaaa");
    }

    static void m1(int a, int b) {
        System.out.println(a + " aaabbb " + b);
    }

    public static void main(String[] args) {
        System.out.println("Start");

        m1(10, 202);
        m1(34);

        System.out.println("End");
    }
}
