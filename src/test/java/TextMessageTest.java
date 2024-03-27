import org.junit.jupiter.api.Test;

import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class TextMessageTest {

    @Test
    public void testSend() {
        MessageService mockService = Mockito.mock(MessageService.class);

        TextMessage textMessage = new TextMessage(mockService);

        String testMessage = "Test message";

        textMessage.send(testMessage);

        verify(mockService).sendMessage(testMessage);
    }
}