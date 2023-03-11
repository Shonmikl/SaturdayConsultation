package saturday.patterns.state;

import java.util.Random;

public abstract class State {
    int count = 10;

    abstract public void put(GumMachine gumMachine);
    abstract public void get(GumMachine gumMachine);
}

class NoQuarter extends State {

    @Override
    public void put(GumMachine gumMachine) {
        if(new Random().nextBoolean()) {
            System.out.println("Win");
            gumMachine.state = new Winner();
        } else {
            gumMachine.state = new HasQuarter();
        }
    }

    @Override
    public void get(GumMachine gumMachine) {
        System.out.println("NoQuarter");
    }
}

class Winner extends State {

    @Override
    public void put(GumMachine gumMachine) {
        System.out.println("Win");
    }

    @Override
    public void get(GumMachine gumMachine) {
        System.out.println("GetGum");
        gumMachine.state = new NoQuarter();
    }
}

class HasQuarter extends State {

    @Override
    public void put(GumMachine gumMachine) {
        System.out.println("You already have");
    }

    @Override
    public void get(GumMachine gumMachine) {
        if(count <= 0) {
            gumMachine.state = new SoldOut();
        } else {
            System.out.println("Selling....");
            count--;
            gumMachine.state = new NoQuarter();
        }
    }
}

class SoldOut extends State {

    @Override
    public void put(GumMachine gumMachine) {
        System.out.println("No Gums");
    }

    @Override
    public void get(GumMachine gumMachine) {
        System.out.println("No Gums");
    }
}