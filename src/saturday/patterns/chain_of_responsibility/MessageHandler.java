package saturday.patterns.chain_of_responsibility;

public abstract class MessageHandler {

    MessageHandler messageHandler;

    public MessageHandler(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    abstract void handle(String str);
}
