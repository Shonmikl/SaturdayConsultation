package saturday.patterns.adaptor;

public class SimpleAmericanSocket implements AmericanSocket {
    @Override
    public void getPower() {
        System.out.println("110V");
    }
}
