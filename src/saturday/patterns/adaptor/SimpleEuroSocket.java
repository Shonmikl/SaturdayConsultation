package saturday.patterns.adaptor;

public class SimpleEuroSocket implements EuroSocket {
    @Override
    public void getPower() {
        System.out.println("230V");
    }
}