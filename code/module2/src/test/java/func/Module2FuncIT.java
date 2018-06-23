package func;

import module2.Module2Class;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Module2FuncIT {
    @Test
    public void shouldDoABasicTest() throws Exception {
        assertTrue("My test condition", Module2Class.testedMethod());
    }
}
