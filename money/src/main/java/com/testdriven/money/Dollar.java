/*
 * The Money Application
 */
package com.testdriven.money;

/**
 *
 * @author emaph
 */
class Dollar extends Money {

    private int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        Dollar dollar = (Dollar) obj;
        return amount == dollar.amount;
    }


}
