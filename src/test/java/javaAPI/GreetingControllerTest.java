package javaAPI;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreetingControllerTest {
    @Test
    public void ControllerRepliesWithAGreeting() {
        GreetingController controller = new GreetingController();
        Greeting response = controller.greeting("test");
        assertEquals("Must give greeting to \"test\"","hello, test!", response.getContent());
    }
}
