package saturday.patterns.memento;

import java.util.ArrayList;
import java.util.List;

public class Originator {
    String state;

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveState() {
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento memento) {
        this.state = memento.state;
    }

    static class Memento {
        String state;

        public Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }
}

class Main {
    public static void main(String[] args) {
        List<Originator.Memento> list = new ArrayList<>();
        Originator originator = new Originator();

        originator.setState("1");
        list.add(originator.saveState());

        originator.setState("2");
        list.add(originator.saveState());

        originator.setState("3");
        list.add(originator.saveState());


        System.out.println(originator.state);
        originator.restoreFromMemento(list.get(0));

        System.out.println(originator.state);
    }
}