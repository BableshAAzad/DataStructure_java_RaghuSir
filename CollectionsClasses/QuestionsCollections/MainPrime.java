package CollectionsClasses.QuestionsCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int t = sc.nextInt();
        ArrayList<Boolean> result = new ArrayList<Boolean>(t);
        System.out.println("Enter " + t + " Values : ");
        while (t > 0) {
            int n = sc.nextInt();
            result.add(isPrime(n));
            t--;
        }
        for (Boolean res : result) {
            System.out.println(res);
        }
    }

    static Boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
