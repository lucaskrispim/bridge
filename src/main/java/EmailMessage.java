public class EmailMessage extends MessageSender {
    public EmailMessage(MessageService service) {
        super(service);
    }

    public void send(String message) {
        System.out.println("Email: " + message);
        service.sendMessage(message);
    }
}