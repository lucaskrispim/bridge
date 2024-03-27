import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SocialMediaTest {

    @Test
    public void testSendMessage() {
        SocialMedia socialMedia = new SocialMedia();
        String message = "Teste de mensagem";

        String expected = "Postando em rede social: " + message;
        String actual = socialMedia.sendMessage(message);

        assertEquals(expected, actual);
    }
}