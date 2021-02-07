
package com.testdriven.money;

/**
 * Common base class for Currency classes
 * @author emaphis
 */
public class Money implements Expression {
    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public Expression plus(Money addend) {
        return new Sum(this, addend);
    }

    public String currency() {
        return currency;
    }

    @Override
    public Money reduce(String to) {
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount
            && currency().equals(money.currency());
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }

}
