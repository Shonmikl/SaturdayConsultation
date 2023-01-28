package saturday.patterns.adaptor;

public class Radio {

    public void turnOn(EuroSocket euroSocket) {
        euroSocket.getPower();
    }
}