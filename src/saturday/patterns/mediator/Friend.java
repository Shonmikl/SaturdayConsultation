package saturday.patterns.mediator;

public abstract class Friend {
    Chat chat;
    String name;

    public Friend(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    abstract void sendMessage(String message);
    abstract void printMessage(String message);
}

class FriendImpl extends Friend {

    public FriendImpl(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    void printMessage(String message) {
        System.out.println(name + " get message: " + message);
    }
}