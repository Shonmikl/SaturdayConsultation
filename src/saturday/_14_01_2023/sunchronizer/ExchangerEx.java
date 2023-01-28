package saturday._14_01_2023.sunchronizer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();

        List<Action> friendsAction = new ArrayList<>();
        friendsAction.add(Action.PAPER);
        friendsAction.add(Action.PAPER);
        friendsAction.add(Action.STONE);

        List<Action> friendsAction2 = new ArrayList<>();
        friendsAction2.add(Action.SCISSORS);
        friendsAction2.add(Action.STONE);
        friendsAction2.add(Action.SCISSORS);

        new Friend("Svitlana", friendsAction, exchanger);
        new Friend("Mihail", friendsAction2, exchanger);
    }
}

enum Action {
    STONE,
    SCISSORS,
    PAPER
}

class Friend extends Thread {
    private String name;
    private List<Action> myAction;
    private Exchanger<Action> exchanger;

    public Friend(String name, List<Action> myAction, Exchanger<Action> exchanger) {
        this.name = name;
        this.myAction = myAction;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWin(Action myAction, Action anotherAction) {
        if(myAction == Action.STONE && anotherAction == Action.SCISSORS
        || myAction == Action.SCISSORS && anotherAction == Action.PAPER
        || myAction == Action.PAPER && anotherAction == Action.STONE) {
            System.out.println(name + " WINS!!");
        }
    }

    public void run() {
        Action reply;
        for (Action action : myAction) {
            try {
                reply = exchanger.exchange(action);
                whoWin(action, reply);
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}