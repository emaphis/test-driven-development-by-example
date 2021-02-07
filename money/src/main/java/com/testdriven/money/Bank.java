package com.testdriven.money;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author emaphis
 */
public class Bank {
    private final Map<Pair, Integer> rates = new HashMap<>();

    private class Pair {

        private final String from;
        private final String to;

        Pair(String from, String to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            Pair pair = (Pair) obj;
            return from.equals(pair.from) && to.equals(pair.to);
        }

        @Override
        public int hashCode() {
            return Objects.hash(from, to) + 137;
        }
    }


    public int rate(String from, String to) {
        if (from.equals(to)) return 1;
        int rate = rates.get(new Pair(from, to));
        return rate;
    }

    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);
    }

}
