package saturday.patterns.composite;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Folder {
    String name;

    List<Folder> list = new LinkedList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addFolder(Folder... folders) {
        list.addAll(Arrays.asList(folders));
    }

    //todo print out
    public void printFolders() {
        for (Folder folder : list) {
            System.out.println(folder.name);
            System.out.print("-\t");
            folder.printFolders();
        }
    }
}