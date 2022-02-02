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
        if (source instanceof Money) return (Money) source;
        Sum sum = (Sum) source;
        return sum.reduce(to);
    }

}
