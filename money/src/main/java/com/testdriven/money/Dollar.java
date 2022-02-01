/*
 * The Money Application
 */
package com.testdriven.money;

/**
 *
 * @author emaph
 */
class Dollar extends Money {

    Dollar(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }


}
