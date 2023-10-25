package FileHandlingIOPakage.CopyOneFileToAnother;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyOneToAnotherAndPrint {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream(
                "D:\\a. programming\\java\\BableshWorkSpace\\DataStructure_java_RaghuSir\\FileHandlingIOPakage\\AAzadData\\WriteData\\WtiteDemo.txt");
        FileOutputStream fout = new FileOutputStream(
                "D:\\a. programming\\java\\BableshWorkSpace\\DataStructure_java_RaghuSir\\FileHandlingIOPakage\\AAzadData\\WriteData\\CopiedDemo.txt");
        while (true) {
            int x = fin.read();
            if (x == -1)
                break;
            System.out.print((char) x);
            fout.write(x);
            Thread.sleep(200);
        }
        System.out.println("\nSuccessfully copied ......................");
        fout.flush();
        fout.close();
        fin.close();
    }
}
