/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shopping_cart;

import junit.framework.TestCase;

/**
 *
 * @author emaphis
 */
public class ItemTest extends TestCase {

    public ItemTest(String testName) {
        super(testName);
    }

    /**
     * Test of addCount method, of class Item.
     */
    public void testAddCount() {
        System.out.println("addCount");
        int count = 5;
        Item instance = new Item("apple");
        instance.addCount(count);
        int result = instance.getCount();
        assertEquals(count, result);
    }


    public void testAddCountTwice() {
        System.out.println("addCount");
        int count = 5;
        int secondCount = 3;
        Item instance = new Item("apple");
        instance.addCount(count);
        instance.addCount(secondCount);
        int result = instance.getCount();
        assertEquals(count+secondCount, result);
    }

    /**
     * Test of subCount method, of class Item.
     */
    public void testSubCount() {
        System.out.println("subCount");
        int count = 5;
        int subCount = 5;
        Item instance = new Item("apple");
        instance.addCount(count);
        instance.subCount(subCount);
        int result = instance.getCount();
        assertEquals(count-subCount, result);
    }


    public void testSubNegativeThrowsException() {
        System.out.println("subCount");
        int count = 5;
        int subCount = 8; // negative result
        Item instance = new Item("apple");
        instance.addCount(count);
        try {
            instance.subCount(subCount);
            fail("Negative result should throw an exception");
        } catch (NegativeCountException ex) {
            assertTrue(true);
        }
    }

    /**
     * Test of getName method, of class Item.
     */
    public void testGetName() {
        System.out.println("getName");
        Item instance = new Item("apple");
        String expResult = "apple";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCount method, of class Item.
     */
    public void testGetCount() {
        System.out.println("getCount");
        Item instance = new Item("apple");
        int expResult = 0;
        int result = instance.getCount();
        assertEquals(expResult, result);
    }

    public void testAddAndGetCount() {
        System.out.println("getCount");
        Item instance = new Item("apple");
        instance.addCount(5);
        int expResult = 5;
        int result = instance.getCount();
        assertEquals(expResult, result);
    }


    public void testAddTwiceAndGetCount() {
        System.out.println("getCount");
        Item instance = new Item("apple");
        instance.addCount(5);
        int expResult = 5;
        int result = instance.getCount();
        assertEquals(expResult, result);
        instance.addCount(3);
        expResult += 3;
        result = instance.getCount();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Item.
     */
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Item("apple");
        Item instance = new Item("apple");
        assertTrue(obj.equals(instance));
    }

    public void testEqualsDifferentCountsButSameNameShouldBeEqual() {
        Item instance1 = new Item("apple");
        instance1.addCount(5);
        Item instance2 = new Item("apple");
        instance1.addCount(3);
        assertTrue(instance1.equals(instance2));
    }
}
