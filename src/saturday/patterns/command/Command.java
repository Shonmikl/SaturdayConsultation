package saturday.patterns.command;

@FunctionalInterface
public interface Command {
    void execute();
}

class Button {
    Command command;

    public Button(Command command) {
        this.command = command;
    }

    void pressButton() {
        command.execute();
    }
}