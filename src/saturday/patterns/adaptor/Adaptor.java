package saturday.patterns.adaptor;

public class Adaptor implements EuroSocket {
    AmericanSocket americanSocket;

    public Adaptor(AmericanSocket americanSocket) {
        this.americanSocket = americanSocket;
    }

    @Override
    public void getPower() {
        americanSocket.getPower();
    }
}