/*
 * Money App
 */
package com.testdriven.money;

/**
 *
 * @author emaph
 */
class Bank {

    Money reduce(Expression source, String to) {
        Sum sum = (Sum) source;
        int amount = sum.augend.amount + sum.addend.amount;
        return new Money(amount, to);
    }

}
