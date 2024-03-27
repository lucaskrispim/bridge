import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EmailTest {

    @Test
    public void testSendMessage() {
        Email email = new Email();
        String message = "Test message";

        String expected = "Enviando email: " + message;
        String actual = email.sendMessage(message);

        assertEquals(expected, actual);
    }
}