package CommondLineArguments;

public class AdditionArgs {
    public static void main(String[] args) {
        System.out.println("Number of values : " + args.length);
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println("Sum of total values : " + sum);
    }
}
