
import org.junit.jupiter.api.Test;

import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.extension.ExtendWith;



public class EmailMessageTest {

    @Test
    public void testSend() {
        MessageService mockService = Mockito.mock(MessageService.class);

        EmailMessage emailMessage = new EmailMessage(mockService);

        String testMessage = "Test message";

        emailMessage.send(testMessage);

        verify(mockService).sendMessage(testMessage);
    }
}