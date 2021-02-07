package com.testdriven.money;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author emaphis
 */
public class Bank {
    private Map<Pair, Integer> rates = new HashMap<>();


    private class Pair {

        private String from;
        private String to;

        Pair(String from, String to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public boolean equals(Object obj) {
            Pair pair = (Pair) obj;
            return from.equals(pair.from) && to.equals(pair.to);
        }

        @Override
        public int hashCode() {
            return 0;
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
