public class Email implements MessageService {
    public String sendMessage(String message) {
        return "Enviando email: " + message;
    }
}