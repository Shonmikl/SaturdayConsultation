package saturday.patterns.chain_of_responsibility;

public class MessageVerifyHandler extends MessageHandler{
    public MessageVerifyHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String message) {
        if(!message.matches(".*\\d.*")) {
            messageHandler.handle(message);
        }
    }
}