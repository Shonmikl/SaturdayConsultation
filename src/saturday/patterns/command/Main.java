package saturday.patterns.command;

public class Main {
    public static void main(String[] args) {
        Command command = new LightAndMusicCommand(new Light(), new MusicPlayer());
        Command command1 = new PhoneCommand("Mike", new Phone());

        Button button = new Button(command1);
        button.pressButton();
    }
}
