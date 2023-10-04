package CollectionsClasses.QuestionsCollections.EvalutePostExpression;

import java.util.Scanner;
import java.util.Stack;

public class EvaluatePostFixedExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the postfix expression : ");
        String st = sc.next();
        double eva = evaluate(st);
        System.out.println("Evaluvated value : " + eva);
    }

    static double evaluate(String st) {
        Scanner sc = new Scanner(System.in);
        Stack<Double> stk = new Stack<Double>();
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (Character.isAlphabetic(ch)) {
                System.out.println("Enter the value of : " + ch);
                stk.push(sc.nextDouble());
            } else {
                double v2 = stk.pop();
                double v1 = stk.pop();
                switch (ch) {
                    case '+':
                        stk.push(v1 + v2);
                        break;
                    case '-':
                        stk.push(v1 - v2);
                        break;
                    case '*':
                        stk.push(v1 * v2);
                        break;
                    case '/':
                        stk.push(v1 / v2);
                        break;
                    case '%':
                        stk.push(v1 % v2);
                        break;
                }
            }
        }
        return stk.peek();
    }
}
