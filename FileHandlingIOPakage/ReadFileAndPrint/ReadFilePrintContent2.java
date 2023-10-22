package FileHandlingIOPakage.ReadFileAndPrint;

import java.io.FileInputStream;

public class ReadFilePrintContent2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream(
                "D:\\a. programming\\java\\BableshWorkSpace\\DataStructure_java_RaghuSir\\FileHandlingIOPakage\\AAzadData\\RawData\\BableshDetails.txt");
        while (true) {
            int x = fin.read();
            if (x == -1)
                break;
            System.out.print((char) x);
        }
        fin.close();
    }
}
