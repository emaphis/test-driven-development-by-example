
package com.testdriven.money;

/**
 * Money App
 * Test drives the money classes
 * @author emaphis
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Money Awoo.");
        var d1 = new Dollar(10);
        var d2 = new Dollar(20);
        var d3 = d1.times(2);
        System.out.println("Are they equal: " + d1.equals(d2));
        System.out.println("Are they equal: " + d2.equals(d3));
    }
}
