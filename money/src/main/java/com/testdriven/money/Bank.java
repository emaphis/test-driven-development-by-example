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
        return source.reduce(to);
    }

}
