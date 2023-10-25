package FileHandlingIOPakage.ReadMultipleFileAndConvertSingleFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class MergeMultipleFilesInSingleFile {
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
        FileOutputStream fout = new FileOutputStream(
                "D:\\a. programming\\java\\BableshWorkSpace\\DataStructure_java_RaghuSir\\FileHandlingIOPakage\\AAzadData\\WriteData\\MergedMultipleFiles.txt");
        while (true) {
            int x = sin.read();
            if (x == -1)
                break;
            fout.write(x);
        }
        fout.flush();
        fout.close();
        System.out.println("Merged Successfully Done...");
    }
}
