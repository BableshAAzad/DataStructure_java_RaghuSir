package Practice;

class ABC {
    Integer a;

    ABC(Integer a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        ABC a2 = (ABC) o;
        return this.a==a2.a;
    }
}

public class DemoX {
    public static void main(String[] args) {
        ABC a1 = new ABC(20);
        ABC a2 = new ABC(20);
        System.out.println(a1.equals(a2));
    }
}
