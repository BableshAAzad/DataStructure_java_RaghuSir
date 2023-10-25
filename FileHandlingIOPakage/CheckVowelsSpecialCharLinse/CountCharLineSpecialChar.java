package FileHandlingIOPakage.CheckVowelsSpecialCharLinse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CountCharLineSpecialChar {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        String v = "AEIOUaeiou";
        FileInputStream fin = new FileInputStream(
                "D:\\a. programming\\java\\BableshWorkSpace\\DataStructure_java_RaghuSir\\FileHandlingIOPakage\\CopyOneFileToAnother\\CopyOneToAnother1.java");
        int vcount = 0, acount = 0, lines = 0;
        while (true) {
            int x = fin.read();
            if (x == -1)
                break;
            if (v.indexOf((char) x) >= 0) // != -1
                vcount++;
            if (Character.isLetterOrDigit(x) == false && Character.isWhitespace(x) == false)
                acount++;
            if (x == '\n')
                lines++;
        }
        System.out.println("Number of Vowels : " + vcount);
        System.out.println("Number of Special Charactors : " + acount);
        System.out.println("Number of Lines : " + lines);
    }
}
