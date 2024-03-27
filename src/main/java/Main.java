public class Main {
    public static void main(String[] args) {
        MessageSender text = new TextMessage(new SMS());
        text.send("Olá, este é um teste SMS.");

        MessageSender email = new EmailMessage(new Email());
        email.send("Olá, este é um teste de Email.");

        MessageSender socialMedia = new TextMessage(new SocialMedia());
        socialMedia.send("Olá, esta é uma postagem em rede social.");
    }
}
