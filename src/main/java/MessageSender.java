public abstract class MessageSender {
    protected MessageService service;

    protected MessageSender(MessageService service) {
        this.service = service;
    }

    public abstract void send(String message);
}