
package stack;

import stack.MyStack;
import java.util.EmptyStackException;
import junit.framework.TestCase;

/**
 *
 * @author emaphis
 */
public class MyStackTest extends TestCase {

    public MyStackTest(String testName) {
        super(testName);
    }

    /**
     * Test of push method, of class MyStack.
     */
    public void testPushShouldCreateNonEmptyStack() {
        System.out.println("push");
        String item = "item 1";
        MyStack instance = new MyStack();
        instance.push(item);
        instance.push("Item");
        assertFalse(instance.isEmpty());
    }


    public void testPushOneItem() {
        System.out.println("push");
        String item = "item 1";
        MyStack instance = new MyStack();
        instance.push(item);
        instance.push("Item");
        assertTrue("Item".equals(instance.top()));
    }

    /**
     * Test of pop method, of class MyStack.
     */
    public void testPopShouldThrowExecptionOnEmptyStack() {
        System.out.println("pop");
        MyStack instance = new MyStack();
        try {
            instance.pop();
            fail("pop on empty stack should throw an exception");
        } catch (EmptyStackException ex) {
            assertTrue(true);
        }
    }

    public void testPopShouldReturnTopItem() {
        System.out.println("pop");
        MyStack instance = new MyStack();
        instance.push("Item");
        String expResult = instance.top();
        String result = instance.pop();
        assertEquals(expResult, result);
    }


    public void testPopShouldReturnItemsInReverseOrder() {
        System.out.println("pop");
        MyStack instance = new MyStack();
        instance.push("Item1");
        instance.push("Item2");
        String expResult = instance.top();
        String result = instance.pop();
        assertEquals("Item2", result);
        expResult = instance.top();
        result = instance.pop();
        assertEquals("Item1", result);
        assertTrue(instance.isEmpty());
    }

    public void testPopShouldEmptyStackOnOneItemStack() {
        System.out.println("pop");
        MyStack instance = new MyStack();
        instance.push("Item");
        instance.pop();
        assertTrue(instance.isEmpty());
    }

    /**
     * Test of top method, of class MyStack.
     */
    public void testTopEmptyStackShouldProduceAnExcpetion() {
        MyStack instance = new MyStack();
        String expResult = "";
        try {
            String result = instance.top();
            fail("Empty stack should trow an exception");
        } catch (EmptyStackException e) {
            assertTrue(true);
        }
    }

    /**
     * Returns true if the stack is empty
     */
    public void testTopShouldReturnTopItemIfStackContainsItems() {
        System.out.println("isEmpty");
        MyStack instance = new MyStack();
        instance.push("Item 1");
        String expResult = "Item 1";
        String result = instance.top();
        assertEquals(expResult, result);
    }
}
