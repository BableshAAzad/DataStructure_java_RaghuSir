package LambdaExpression.WithoutArgs;

public class MainDemoLambda {
    public static void main(String[] args) {
        DemoInterface di = () -> {
            System.out.println("I Am m1() method");
        };
        di.m1();
    }
}
