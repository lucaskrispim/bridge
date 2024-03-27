public class TextMessage extends MessageSender {
    public TextMessage(MessageService service) {
        super(service);
    }

    public void send(String message) {
        System.out.println("Texto: " + message);
        service.sendMessage(message);
    }
}