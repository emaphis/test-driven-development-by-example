
package com.testdriven.money;

/**
 *
 * @author emaphis
 */
public interface Expression {
    Money reduce(Bank bank, String to);
}
