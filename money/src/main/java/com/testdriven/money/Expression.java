/*
 * Money App.
 */
package com.testdriven.money;

/**
 *
 * @author emaph
 */
public interface Expression {
    Money reduce(Bank bank, String to);
    Expression plus(Expression addend);
    Expression times(int multiplier);
}
