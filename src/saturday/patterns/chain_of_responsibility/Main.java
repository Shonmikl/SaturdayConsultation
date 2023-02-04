package saturday.patterns.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        MessageHandler messageHandler =
                new MessageAddExclamationMarkHandler(
                        new MessageVerifyHandler(
                                new MessagePrintHandler(null)));
        messageHandler.handle("HI");
    }
}