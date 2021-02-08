
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

}
