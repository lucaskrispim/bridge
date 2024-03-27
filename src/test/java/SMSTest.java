import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class SMSTest {

        @Test
        public void testSendMessage() {
            SMS sms = new SMS();
            String message = "Hello World";

            String expected = "Enviando mensagem SMS: " + message;
            String actual = sms.sendMessage(message);

            assertEquals(expected, actual);
        }

}