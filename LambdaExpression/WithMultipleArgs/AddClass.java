package LambdaExpression.WithMultipleArgs;

public class AddClass {
    public static void main(String[] args) {
        // AddInterface ai = (int a, int b)->{ return a+b;};
        // AddInterface ai = (a, b)->{ return a+b;};
        AddInterface ai = (a, b)-> a+b;
        // AddInterface ai = (a, b)-> return a+b; // this is wrong syntax if write to return type then use{}
        System.out.println(ai.add(4, 5));

    }
}
