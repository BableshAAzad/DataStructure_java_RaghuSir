package FileHandlingIOPakage.ReadFileAndPrint;

import java.io.FileInputStream;

public class ReadToSelfAndPrint {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream(
                "D:\\a. programming\\java\\BableshWorkSpace\\DataStructure_java_RaghuSir\\FileHandlingIOPakage\\ReadFileAndPrint\\ReadToSelfAndPrint.java");
        while (true) {
            int x = fin.read();
            if (x == -1)
                break;
            System.out.print((char) x);
        }
        fin.close();
    }
}
