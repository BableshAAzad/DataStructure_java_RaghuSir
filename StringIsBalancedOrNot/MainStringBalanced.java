package StringIsBalancedOrNot;

import java.util.Scanner;
import java.util.Stack;

public class MainStringBalanced {
    static boolean isBalanced(String str) {
        if (str.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stk = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(')
                stk.push(ch);
            else {
                if (str.isEmpty())
                    return false;
                switch (ch) {
                    case '}':
                        if (stk.pop() != '{')
                            return false;
                        break;
                    case ']':
                        if (stk.pop() != '[')
                            return false;
                        break;
                    case ')':
                        if (stk.pop() != '(')
                            return false;
                        break;
                }
            }
        }
        return stk.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.next();
        boolean rs = isBalanced(str);
        if (rs)
            System.out.println("String is Balanced");
        else
            System.out.println("String is not balanced");
        sc.close();
    }
}
