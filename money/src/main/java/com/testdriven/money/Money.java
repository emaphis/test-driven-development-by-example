
package com.testdriven.money;

import java.util.Objects;

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

    @Override
    public Expression times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    public String currency() {
        return currency;
    }

    @Override
    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Money money = (Money) obj;
        return amount == money.amount
            && currency().equals(money.currency());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.amount;
        hash = 53 * hash + Objects.hashCode(this.currency);
        return hash;
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }

}
