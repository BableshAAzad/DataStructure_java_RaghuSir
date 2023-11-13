package Practice.leetcodePractice;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz412 {
    public static List<String> fizzBuzz(int n) {
        ArrayList<String> al = new ArrayList<>();
        int a = 1;
        for (int i = 0; i < n; i++) {
            if (a % 3 == 0 && a % 5 == 0)
                al.add(i, "FizzBuzz");
            else if (a % 3 == 0)
                al.add(i, "Fizz");
            else if (a % 5 == 0)
                al.add(i, "Buzz");
            else
                al.add(i, a + "");
            a++;
        }
        return al;
    }

    public static void main(String[] args) {
        int n = 15;
        List<String> al = fizzBuzz(n);
        // System.out.println(2%3);
        System.out.println(al);
    }
}
/*
 * Given an integer n, return a string array answer (1-indexed) where:
 * 
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 * 
 * 
 * Example 1:
 * 
 * Input: n = 3
 * Output: ["1","2","Fizz"]
 * Example 2:
 * 
 * Input: n = 5
 * Output: ["1","2","Fizz","4","Buzz"]
 * Example 3:
 * 
 * Input: n = 15
 * Output:
 * ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14"
 * ,"FizzBuzz"]
 */
