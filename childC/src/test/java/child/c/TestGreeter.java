package child.c;

import child.a.Greeter;
import chld.c.PropertyGreeterImpl;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class TestGreeter {
    @Test
    public void testPropertyGreeterImpl() throws IOException {
        Greeter greeter = new PropertyGreeterImpl("/childB.properties");
        assertEquals("hello foo", greeter.getHello("foo"));
        assertEquals("hello childB", greeter.getHello());

        greeter = new PropertyGreeterImpl("/childc.properties");
        assertEquals("hello World", greeter.getHello());
    }
}
