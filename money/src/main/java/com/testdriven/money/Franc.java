/*
 * The Money Application
 */
package com.testdriven.money;

/**
 *
 * @author emaph
 */
class Franc {

    private int amount;

    Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        Franc dollar = (Franc) obj;
        return amount == dollar.amount;
    }


}