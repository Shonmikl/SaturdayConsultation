package saturday.inputOutput;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("article.txt")) {
            int characters = 0;

            while ((characters = fileReader.read()) != -1) {
                // -1 это когда конец файла
                System.out.print((char) characters);
            }

            System.out.println("\n");
            System.out.println("DONE");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}