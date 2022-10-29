package saturday._22102022.inputOutput;

import java.io.*;

//для работы с бинарными файлами
public class FileInputStreamAndOutputStream {
    public static void main(String[] args) {

        try (FileInputStream inputStream = new FileInputStream("E:\\SaturdayConsultation\\img.png");
             FileOutputStream outputStream = new FileOutputStream("E:\\SaturdayConsultation\\newImg.png")) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            System.out.println("DONE");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}