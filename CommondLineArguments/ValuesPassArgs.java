package CommondLineArguments;

public class ValuesPassArgs {
    public static void main(String[] args) {
        System.out.println("Number of arguments : " + args.length);
        System.out.println("Here values present is : ");
        for (int i = 0; i < args.length; i++) {
            System.out.println(i + " --> " + args[i]);
        }
    }
}
