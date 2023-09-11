package Recursion.BackWordDriving;

public class DemoBW {
    public static void main(String[] args) {
        display(5);
    }

    private static void display(int n) {
        if (n > 1)
            display(n - 1);
        System.out.println("Hello");
    }
}
