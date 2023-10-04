package QuestionsJava.TowerOfHanoi;

import java.util.Scanner;

public class MainTowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of hanoi : ");
        int n = sc.nextInt();
        towerOfHanoi(n, 'S', 'T', 'D');
    }

    static void towerOfHanoi(int n, char s, char t, char d) {
        if(n==1){
            System.out.println(n+" disk move from "+s+" to "+d);
           return;
        }
        towerOfHanoi(n-1, s, d, t);
        System.out.println(n+" disk move from "+s+" to "+d);
        towerOfHanoi(n-1, t, s, d);
    }
}
