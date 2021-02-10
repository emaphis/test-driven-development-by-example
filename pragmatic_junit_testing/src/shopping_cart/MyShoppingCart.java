package shopping_cart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author emaphis
 */
public class MyShoppingCart implements ShoppingCart {

    private List<Item> cart = new ArrayList<>();

    /**
     * Add this many of this item to the shopping cart.
     * @param anItem the item to add to cart
     * @param quantity number of items to add to cart
     */
    @Override
    public void addItems(Item anItem, int quantity)
            throws NegativeCountException {
        if (cart.contains(anItem)) {
            anItem.addCount(quantity);
        } else {
            anItem.addCount(quantity);
            cart.add(anItem);
        }
    }

    /**
     * Delete this many of this item from the shopping cart
     * @param anItem the item to delete from the cart.
     * @param quantity quzntity of items to delete.
     */
    @Override
    public void deleteItems(Item anItem, int quantity)
            throws NegativeCountException, NoSuchItemException {
        if (!cart.contains(anItem)) throw new NoSuchItemException();
        else {
            int idx = cart.indexOf(anItem);
            Item item = cart.get(idx);
            item.subCount(quantity);
        }
    }

    /**
     * Count of all items in the cart (that is, all items x qty each)
     * @return the item count
     */
    @Override
    public int itemCount() {
        int count = 0;
        for (Item item : cart) {
            count += item.getCount();
        }
        return count;
    }

    /**
     * Return Iterator of all items (see Java Collection’s doc)
     * @return iterator
     */
    @Override
    public Iterator iterator() {
        return cart.iterator();
    }
}
