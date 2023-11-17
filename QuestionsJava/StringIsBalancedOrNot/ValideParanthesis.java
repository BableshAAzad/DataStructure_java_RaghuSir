package QuestionsJava.StringIsBalancedOrNot;

import java.util.Stack;

class ValideParanthesis {
    public static boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else if (st.empty()) {
                return false;
            } else if (st.peek() == '{' && s.charAt(i) == '}') {
                st.pop();
            } else if (st.peek() == '(' && s.charAt(i) == ')') {
                st.pop();
            } else if (st.peek() == '[' && s.charAt(i) == ']') {
                st.pop();
            } else {
                return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = ")(){}";
        boolean bl = isValid(s);
        System.out.println(bl);
    }
}