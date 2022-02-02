
package com.testdriven.money;

/**
 * Money App
 * Test drives the money classes
 * @author emaphis
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Money Awoo.");
        Money five = Money.dollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        System.err.println("output");
        assert(five.equals(sum.augend));
        assert(five.equals(sum.addend));

    }
}
