package LambdaExpression.WithoutArgs;

public class MainDemoClass implements DemoInterface {
    @Override
    public void m1() {
        System.out.println("I Am m1() method");
    }

    public static void main(String[] args) {
        MainDemoClass mdc = new MainDemoClass();
        mdc.m1();
    }
}
