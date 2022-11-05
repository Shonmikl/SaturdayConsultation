package saturday._22102022.inputOutput;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static final String PATH="C:\\Projects\\Daten\\26.10.2022_Java_Homework_Filereader_Filewriter_List_from_Links";
    public static String FILE_NAME="file1.link";
    public static void main(String[] args) {
        System.out.println(res());

        File dir=new File(PATH);
        if (dir.exists()){
            System.out.println("papka suschestvuet");
        }else System.out.println("papka ne suschestvuet");


        File[] filesArr= dir.listFiles();

        for (File file: filesArr){
            System.out.println(res());

        }
        System.out.println("length array: "+filesArr.length);
        System.out.println(filesArr);

    }



    public static List res(){
        try (BufferedReader reader=new BufferedReader(new FileReader(FILE_NAME))){
            return reader.lines().collect(Collectors.toList());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}