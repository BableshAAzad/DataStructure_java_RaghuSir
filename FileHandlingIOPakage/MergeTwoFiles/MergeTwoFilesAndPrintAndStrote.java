package FileHandlingIOPakage.MergeTwoFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class MergeTwoFilesAndPrintAndStrote {
    public static void main(String[] args) throws IOException {
        FileInputStream fin1 = new FileInputStream(
                "D:\\a. programming\\java\\BableshWorkSpace\\DataStructure_java_RaghuSir\\FileHandlingIOPakage\\AAzadData\\RawData\\BableshDetails.txt");
        FileInputStream fin2 = new FileInputStream(
                "D:\\a. programming\\java\\BableshWorkSpace\\DataStructure_java_RaghuSir\\FileHandlingIOPakage\\AAzadData\\RawData\\BableshCollecge.txt");
        SequenceInputStream sin = new SequenceInputStream(fin1, fin2);
        FileOutputStream fout = new FileOutputStream(
                "D:\\a. programming\\java\\BableshWorkSpace\\DataStructure_java_RaghuSir\\FileHandlingIOPakage\\AAzadData\\WriteData\\TwoMergedFiles.txt");
        while (true) {
            int x = sin.read();
            if (x == -1)
                break;
            fout.write(x);
            System.out.print((char) x);
        }
        fout.flush();
        fout.close();
        System.out.println("\nCopied Successfully done .... .... ....");
    }
}
