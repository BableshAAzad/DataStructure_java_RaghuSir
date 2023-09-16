package CommondLineArguments;

public class CountArgs {
    public static void main(String[] args) {
        int iCount = 0, fCount = 0, sCount = 0;
        for (int i = 0; i < args.length; i++) {
            try {
                Integer.parseInt(args[i]);
                iCount++;
            } catch (NumberFormatException e) {
                try {
                    Double.parseDouble(args[i]);
                    fCount++;
                } catch (NumberFormatException e1) {
                    sCount++;
                }
            }
        }
        System.out.println("Number of Integer present is : " + iCount);
        System.out.println("Number of Floating Point is : " + fCount);
        System.out.println("Number of Strings is : " + sCount);
    }

}
