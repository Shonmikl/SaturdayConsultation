package saturday.inputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

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