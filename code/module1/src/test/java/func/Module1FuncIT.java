package func;
import module1.Module1Class;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Module1FuncIT {
    @Test
    public void shouldDoABasicTest() throws Exception {
        assertTrue("My test condition", Module1Class.testedMethod());
    }
}
