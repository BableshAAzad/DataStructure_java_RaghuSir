package VariableArgumentsVarArgs.DemoVarArgs;

public class MainDemoVarArgs {
    static int sum(int... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int sumNo = sum(3,1);
        System.out.println(sumNo);
        sumNo = sum(4,2,5,1,5,2,3);
        System.out.println(sumNo);
        sumNo = sum(4,2,5,1,5,2,3);
        System.out.println(sumNo);
        sumNo = sum();
        System.out.println(sumNo);
    }
}
