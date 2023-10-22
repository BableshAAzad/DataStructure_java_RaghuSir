package FileHandlingIOPakage.ReadAndWriteFile;

import java.io.FileOutputStream;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        String str = "Bablesh is a good person and He is always hard work and followed rules strictally";
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(
                    "D:\\a. programming\\java\\BableshWorkSpace\\DataStructure_java_RaghuSir\\FileHandlingIOPakage\\AAzadData\\WriteData\\WtiteDemo.txt");
            byte[] b = str.getBytes();
            fout.write(b);
            fout.flush();
            System.out.println("Successfully writen done...........");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fout.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thanks you....");
    }
}
