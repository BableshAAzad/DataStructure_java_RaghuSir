package FileHandlingIOPakage.CopyOneFileToAnother;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyOneToAnother1 {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream(
                "D:\\a. programming\\java\\BableshWorkSpace\\DataStructure_java_RaghuSir\\FileHandlingIOPakage\\AAzadData\\RawData\\BableshDetails.txt");
        FileOutputStream fout = new FileOutputStream(
                "D:\\a. programming\\java\\BableshWorkSpace\\DataStructure_java_RaghuSir\\FileHandlingIOPakage\\AAzadData\\WriteData\\DetailsDublicate.txt");
        while (true) {
            int x = fin.read();
            if (x == -1)
                break;
            fout.write(x);
        }
        fout.flush();
        fout.close();
        fin.close();
        System.out.println("Data copied successfully done");
    }
}