package saturday.patterns.chain_of_responsibility;

public class MessagePrintHandler extends MessageHandler{
    public MessagePrintHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String message) {
        System.out.println(message);
    }
}
