package FileHandlingIOPakage.ReadFileAndPrint;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFilePrintContent {
    public static void main(String[] args) {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream(
                    "D:\\a. programming\\java\\BableshWorkSpace\\DataStructure_java_RaghuSir\\FileHandlingIOPakage\\AAzadData\\RawData\\BableshDetails.txt");
            while (true) {
                int x = fin.read();
                if (x == -1)
                    break;
                System.out.print((char) x);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
