/*
 * The Money Application
 */
package com.testdriven.money;

/**
 *
 * @author emaph
 */
class Franc extends Money {

    Franc(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }


}
