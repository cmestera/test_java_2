import module2.Module2Class;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Module2ClassTest {
    @Test
    public void shouldCoverTestedMethod() throws Exception {
        assertTrue("My test condition", Module2Class.testedMethod());
    }

    @Test
    public void shouldCoverTestedMethod2() throws Exception {
        assertTrue("My test condition",Module2Class.testedMethod2());
    }

}
