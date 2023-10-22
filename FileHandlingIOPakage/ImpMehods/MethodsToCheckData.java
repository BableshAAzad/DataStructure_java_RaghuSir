package FileHandlingIOPakage.ImpMehods;

import java.io.File;

public class MethodsToCheckData {
    public static void main(String[] args) {
        File f = new File(
                "D:\\a. programming\\java\\BableshWorkSpace\\DataStructure_java_RaghuSir\\FileHandlingIOPakage\\AAzadData\\WriteData");
        System.out.println(f.length());
        System.out.println(f.getPath());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        String[] fnames = f.list();
        for (String fname : fnames) {
            System.out.println(fname);
        }
        System.out.println("----------------------------");
        File[] f1 = f.listFiles();
        for (File fls : f1) {
            System.out.println(fls);
        }
    }
}
