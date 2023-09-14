
class DemoFW {
    public static void main(String[] args) {
        display(5);
    }
    
    private static void display(int n) {
        if (n == 0)
        return;
        System.out.println("Hello");
        display(n - 1);
    }
}
// package Recursion.ForwordDriving;