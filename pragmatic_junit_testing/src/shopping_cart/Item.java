
package shopping_cart;

import java.util.Objects;

/**
 * Items in a shopping cart.
 * @author emaphis
 */
class Item {
    private final String name;
    private int count;

    public Item(String name) {
        this.name = name;
        this.count = 0;
    }

    public void addCount(int count) {
        this.count += count;
    }

    public void subCount(int count) throws NegativeCountException {
        if (this.count - count < 0) throw new NegativeCountException();
        this.count -= count;
    }

    public String getName() {
        return this.name;
    }

    public int getCount() {
        return this.count;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return this.getName().equals(item.getName());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.name);
        return hash;
    }

}
