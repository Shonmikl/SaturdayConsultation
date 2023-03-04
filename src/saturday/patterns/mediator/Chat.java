package saturday.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public interface Chat {
    void sendMessage(String message, Friend friend);

    void addFriend(Friend friend);
}

class ChatMediator implements Chat {
    List<Friend> list = new ArrayList<>();

    @Override
    public void sendMessage(String message, Friend iAm) {
        list.forEach(friend -> {
            if (friend != iAm) {
                friend.printMessage(message);
            }
        });
    }

    @Override
    public void addFriend(Friend friend) {
        list.add(friend);
    }
}