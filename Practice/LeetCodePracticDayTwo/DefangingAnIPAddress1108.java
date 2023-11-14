package Practice.LeetCodePracticDayTwo;

public class DefangingAnIPAddress1108 {
    public static String defangIPaddr(String address) {
        StringBuffer temp = new StringBuffer();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.')
                temp.append("[.]");
            else
                temp.append(address.charAt(i));
        }
        return temp.toString().trim();
    }

    public static void main(String[] args) {
        String ip = "1.1.1.1";
        String defIp = defangIPaddr(ip);
        System.out.println(defIp);
    }
}

/*
 * Example 1:
 * 
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 * Example 2:
 * 
 * Input: address = "255.100.50.0"
 * Output: "255[.]100[.]50[.]0"
 * 
 */