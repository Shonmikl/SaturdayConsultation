package saturday.patterns.adaptor;

public class Main {
    public static void main(String[] args) {
        SimpleAmericanSocket simpleAmericanSocket
                = new SimpleAmericanSocket();
        Adaptor adaptor = new Adaptor(simpleAmericanSocket);

        Radio radio = new Radio();
        radio.turnOn(adaptor);
    }
}