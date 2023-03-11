package saturday.patterns.state;

public class GumMachine {
    State state = new NoQuarter();
    public void insert() {
        state.put(this);
    }

    public void setState() {
        state.get(this);
    }
}