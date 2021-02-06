
package com.testdriven.money;

/**
 * Represents the French Franc
 * @author emaphis
 */
public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

}
