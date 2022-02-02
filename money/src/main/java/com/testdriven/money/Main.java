
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
        Money ten = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Expression sum = new Sum(five, ten).plus(five);
        Money result = bank.reduce(sum, "USD");
        System.out.println("Should be $15 - " + result);
    }
}
