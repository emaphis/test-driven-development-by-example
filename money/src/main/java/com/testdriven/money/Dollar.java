/*
 * The Money Application
 */
package com.testdriven.money;

/**
 *
 * @author emaph
 */
class Dollar {

    int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    void times(int multiplier) {
        amount *= multiplier;
    }
}
