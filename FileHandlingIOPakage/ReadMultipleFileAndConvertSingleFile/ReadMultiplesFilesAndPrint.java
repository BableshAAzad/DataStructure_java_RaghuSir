package FileHandlingIOPakage.ReadMultipleFileAndConvertSingleFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class ReadMultiplesFilesAndPrint {
    public static void main(String[] args) throws Exception {
        File f = new File(
                "D:\\a. programming\\java\\BableshWorkSpace\\DataStructure_java_RaghuSir\\FileHandlingIOPakage\\AAzadData\\RawData");
        Vector v = new Vector();
        String[] fnames = f.list();
        for (String fname : fnames) {
            if (fname.endsWith(".txt")) {
                FileInputStream fin = new FileInputStream(
                        "D:\\a. programming\\java\\BableshWorkSpace\\DataStructure_java_RaghuSir\\FileHandlingIOPakage\\AAzadData\\RawData\\"
                                + fname);
                v.add(fin);
            }
        }
        Enumeration en = v.elements();
        SequenceInputStream sin = new SequenceInputStream(en);
        while (true) {
            int x = sin.read();
            if (x == -1)
                break;
            System.out.print((char) x);
        }
    }
}
