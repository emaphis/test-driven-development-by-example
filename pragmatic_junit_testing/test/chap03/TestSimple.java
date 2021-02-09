
package chap03;

import junit.framework.TestCase;

/**
 * A simple example
 * @author emaphis
 */
public class TestSimple extends TestCase {

    public TestSimple(String testName) {
        super(testName);
    }

    public void testAdd() {
        assertEquals(2, 1 + 1);
    }

    public void testAdds() {
        assertEquals(2, 1 + 1);
        assertEquals(4, 2 + 2);
        assertEquals(-8, -12 + 4);
    }
}
