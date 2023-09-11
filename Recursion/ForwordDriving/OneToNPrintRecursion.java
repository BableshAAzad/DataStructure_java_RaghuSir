import java.util.Scanner;

public class OneToNPrintRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("----------------");
        display(n);
        sc.close();
    }

    private static void display(int n) {
        if (n > 1)
            display(n - 1);
        System.out.println(n);
    }
}
