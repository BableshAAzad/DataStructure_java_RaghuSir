package Practice.LeetCodePracticDayTwo;

public class DistributeMoney2591 {
    public static int distMoney(int money, int children) {
        if (children > money)
            return -1;
        else if (children == money)
            return 0;
        else if ((money / children) == children)
            return 0;
        else if (money % children == 2)
            return 1;
        else if (money % children == 0)
            return 2;
        // System.out.println(16 % 2);
        return 0;
    }

    public static void main(String[] args) {
        int money = 4;
        int children = 2;
        int res = distMoney(money, children);
        System.out.println(res);
        System.out.println(4 / 2);
    }
}
