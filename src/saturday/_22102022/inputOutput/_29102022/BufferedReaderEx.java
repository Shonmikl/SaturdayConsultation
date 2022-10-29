package saturday._22102022.inputOutput._29102022;

import java.io.*;

public class BufferedReaderEx {
    BufferedReader reader;
    {
        try {
            reader = new BufferedReader(new FileReader("article.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    BufferedWriter writer;

    {
        try {
            writer = new BufferedWriter(new FileWriter("article1.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}