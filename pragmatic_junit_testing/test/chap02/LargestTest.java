
package chap02;

import junit.framework.TestCase;

/**
 * First example test.
 * @author emaphis
 */
public class LargestTest extends TestCase {

    public LargestTest(String testName) {
        super(testName);
    }

    public void testSimple() {
        assertEquals(9, Largest.largest(new int[] {7,8,9}));
    }

    public void testOrder() {
        assertEquals(9, Largest.largest(new int[] {9,8,7}));
        assertEquals(9, Largest.largest(new int[] {7,9,8}));
        assertEquals(9, Largest.largest(new int[] {7,8,9}));
    }

    public void testDups() {
        assertEquals(9, Largest.largest(new int[] {9,7,9,8,7}));
    }

    public void testOne() {
        assertEquals(1, Largest.largest(new int[] {1}));
    }

    public void testNegative() {
        int [] negList = new int[] {-9, -7, -8, -7};
        assertEquals(-7, Largest.largest(negList));
    }

    public void testEmpty() {
        try {
            Largest.largest(new int[] {});
            fail("Should have thrown an exception");
        } catch (Exception e) {
            assertTrue(true);
        }
    }
}
