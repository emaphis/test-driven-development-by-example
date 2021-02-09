package chap03;

import junit.framework.TestCase;

/**
 * A suite
 * @author emaphis
 */
public class TestClassOne extends TestCase {

    public TestClassOne(String testName) {
        super(testName);
    }

    public void testAddition() {
        assertEquals(4, 2 + 2);
    }

    public void testSubtraction() {
        assertEquals(0, 2 - 2);
    }
}
