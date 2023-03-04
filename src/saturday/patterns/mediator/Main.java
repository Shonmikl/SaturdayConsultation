package saturday.patterns.mediator;

public class Main {
    public static void main(String[] args) {
        String s = "Mike";
        Chat chat = new ChatMediator();
        FriendImpl mike = new FriendImpl(chat, s);
        chat.addFriend(mike);

        chat.addFriend(new FriendImpl(chat, s));
        chat.addFriend(new FriendImpl(chat, s));

        mike.sendMessage("Hello World!!");
    }
}