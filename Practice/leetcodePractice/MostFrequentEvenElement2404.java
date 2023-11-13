package Practice.leetcodePractice;

public class MostFrequentEvenElement2404 {
    public static int mostFrequentEven(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int count = 0, tem = 0, t = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && nums[j] % 2 == 0)
                    count++;
            }
            if (count > tem) {
                tem = count;
                count = 0;
                if (nums[i] > t && t == 0)
                    t = nums[i];
            }    
        }
        if (count == 0)
            return -1;
        return t;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 10000, 10000, 10000, 2 };
        // * 29,47,21,41,13,37,25,7 => -1
        // * 0, 1, 2, 2, 4, 4, 1 => 2
        // * 0,1,2,0,0,0,2,4,4,1 => 0
        // * 2,10000,10000,10000,2
        int a = mostFrequentEven(arr);
        System.out.println(a);
    }
}
