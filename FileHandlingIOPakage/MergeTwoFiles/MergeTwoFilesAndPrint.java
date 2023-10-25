package FileHandlingIOPakage.MergeTwoFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class MergeTwoFilesAndPrint {
    public static void main(String[] args) throws IOException {
        FileInputStream fin1 = new FileInputStream(
                "D:\\a. programming\\java\\BableshWorkSpace\\DataStructure_java_RaghuSir\\FileHandlingIOPakage\\AAzadData\\RawData\\BableshDetails.txt");
        FileInputStream fin2 = new FileInputStream(
                "D:\\a. programming\\java\\BableshWorkSpace\\DataStructure_java_RaghuSir\\FileHandlingIOPakage\\AAzadData\\RawData\\BableshCollecge.txt");
        SequenceInputStream sin = new SequenceInputStream(fin1, fin2);
        while (true) {
            int x = sin.read();
            if (x == -1)
                break;
            System.out.print((char) x);
        }
    }
}
