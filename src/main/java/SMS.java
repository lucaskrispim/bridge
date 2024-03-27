public class SMS implements MessageService {
    public String sendMessage(String message) {
        return "Enviando mensagem SMS: " + message;
    }
}