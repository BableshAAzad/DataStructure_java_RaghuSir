package FileHandlingIOPakage.CheckVowelsSpecialCharLinse;

import java.io.FileInputStream;

public class RemoveSpecialCharators {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream(
                "D:\\a. programming\\java\\BableshWorkSpace\\DataStructure_java_RaghuSir\\FileHandlingIOPakage\\CopyOneFileToAnother\\CopyOneToAnother1.java");
        while (true) {
            int x = fin.read();
            if (x == -1)
                break;
            if (Character.isLetterOrDigit(x) == true || Character.isWhitespace(x) == true)
                System.out.print((char) x);
        }
    }
}
