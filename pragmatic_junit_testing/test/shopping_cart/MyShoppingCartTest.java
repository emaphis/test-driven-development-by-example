/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shopping_cart;

import java.util.Iterator;
import junit.framework.TestCase;

/**
 *
 * @author emaphis
 */
public class MyShoppingCartTest extends TestCase {

    public MyShoppingCartTest(String testName) {
        super(testName);
    }

    public void testAddItems() {
        ShoppingCart cart = new MyShoppingCart();
        cart.addItems(new Item("apple"), 1);
        Iterator<Item> itr = cart.iterator();
        Item result = itr.next();
        Item expected = new Item("apple");
        assertEquals(expected, result);
    }

    public void testAddMoreItems() {
        ShoppingCart cart = new MyShoppingCart();
        cart.addItems(new Item("apple"), 1);
        cart.addItems(new Item("pear"), 2);
        Iterator<Item> itr = cart.iterator();
        Item result = itr.next();
        Item expected = new Item("apple");
        assertEquals(expected, result);
        Item result2 = itr.next();
        Item expected2 = new Item("pear");
        assertEquals(expected2, result2);
    }

    public void testGetCount() {
        ShoppingCart cart = new MyShoppingCart();
        cart.addItems(new Item("apple"), 5);
        assertEquals(5, cart.itemCount());
    }

    public void testGetCount2() {
        ShoppingCart cart = new MyShoppingCart();
        cart.addItems(new Item("apple"), 5);
        cart.addItems(new Item("pear"), 3);
        assertEquals(8, cart.itemCount());
    }


    public void testDeleteItems() {
        ShoppingCart cart = new MyShoppingCart();
        Item item = new Item("apple");
        cart.addItems(item, 8);
        cart.deleteItems(item, 3);
        Iterator<Item> itr = cart.iterator();
        Item result = itr.next();
        assertEquals(5, result.getCount());
    }

    public void testDeleteExistingAmountReturnZeroItems() {
        ShoppingCart cart = new MyShoppingCart();
        Item item = new Item("apple");
        cart.addItems(item, 8);
        cart.deleteItems(item, 8);
        Iterator<Item> itr = cart.iterator();
        Item result = itr.next();
        assertEquals(0, result.getCount());
    }

    public void testDeleteTooManyThrowsAnException() {
        ShoppingCart cart = new MyShoppingCart();
        Item item = new Item("apple");
        cart.addItems(item, 3);
        try {
            cart.deleteItems(item, 8);
            fail("Delete too many should have thrown an Exception");
        } catch (NegativeCountException ex) {
            assertTrue(true);
        }
    }

    public void testDeletingMissingItemThrowsAnException() {

        ShoppingCart cart = new MyShoppingCart();
        Item item = new Item("apple");
        cart.addItems(item, 3);
        try {
            cart.deleteItems(new Item("pear"), 0);
            fail("Delete too many should have thrown an Exception");
        } catch (NoSuchItemException ex) {
            assertTrue(true);
        }
    }
}
