package saturday.patterns.composite;

public class Main {
    public static void main(String[] args) {
        Folder user = new Folder("user");
        Folder mike = new Folder("mike");
        Folder kurt = new Folder("kurt");
        Folder root = new Folder("root");

        root.addFolder(user, mike, kurt);

        Folder one = new Folder("one");
        Folder two = new Folder("two");
        Folder three = new Folder("three");

        user.addFolder(one, two, three);

        Folder four = new Folder("four");
        Folder five = new Folder("five");
        Folder six = new Folder("six");

        root.addFolder(four, five, six);

        user.printFolders();


    }
}
