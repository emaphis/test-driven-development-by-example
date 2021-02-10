package shopping_cart;

import java.util.Iterator;

/**
 *
 * @author emaphis
 */
public interface ShoppingCart {

    /**
     * Add this many of this item to the shopping cart.
     * @param anItem the item to add to cart
     * @param quantity number of items to add to cart
     */
    void addItems(Item anItem, int quantity)
            throws NegativeCountException;

    /**
     * Delete this many of this item from the shopping cart
     * @param anItem the item to delete from the cart.
     * @param quantity quzntity of items to delete.
     */
    public void deleteItems(Item anItem, int quantity)
            throws NegativeCountException, NoSuchItemException;

    /**
     * Count of all items in the cart (that is, all items x qty each)
     * @return the item count
     */
    public int itemCount();

    /**
     * Return Iterator of all items (see Java Collection’s doc)
     * @return iterator
     */
    public Iterator iterator();
}
