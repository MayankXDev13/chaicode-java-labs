package com.chaicode.conditionals;

import com.chaicode.conditionals.model.CoffeeExtras;

/**
 * Bean &amp; Brew Cafe
 *
 * <p>
 * Bean &amp; Brew, the cozy neighborhood cafe, wants to go digital! They
 * need a system that calculates the total price of a coffee order.
 * Here's their menu:
 *
 * <p>
 * Base price by size:
 * <ul>
 * <li>"small" → $3.00</li>
 * <li>"medium" → $4.00</li>
 * <li>"large" → $5.00</li>
 * </ul>
 *
 * <p>
 * Add-on for coffee type:
 * <ul>
 * <li>"regular" → +$0.00</li>
 * <li>"latte" → +$1.00</li>
 * <li>"cappuccino" → +$1.50</li>
 * <li>"mocha" → +$2.00</li>
 * </ul>
 *
 * <p>
 * Optional extras:
 * <ul>
 * <li>whippedCream → +$0.50 (if true)</li>
 * <li>extraShot → +$0.75 (if true)</li>
 * </ul>
 *
 * <p>
 * Rules:
 * <ul>
 * <li>If size is not "small", "medium", or "large", return -1</li>
 * <li>If type is not "regular", "latte", "cappuccino", or "mocha", return
 * -1</li>
 * <li>Return the total price rounded to 2 decimal places</li>
 * </ul>
 *
 * @param size   "small", "medium", or "large"
 * @param type   "regular", "latte", "cappuccino", or "mocha"
 * @param extras optional extras
 * @return total price or -1 for invalid input
 */
public final class CoffeeShop {

    private CoffeeShop() {
    }

    public static double calculateCoffeePrice(String size, String type) {
        return calculateCoffeePrice(size, type, new CoffeeExtras());
    }

    public static double calculateCoffeePrice(String size, String type, CoffeeExtras extras) {
        if (!"small".equals(size)
                && !"medium".equals(size)
                && !"large".equals(size)) {
            return -1;
        }
        if (!"regular".equals(type)
                && !"latte".equals(type)
                && !"cappuccino".equals(type)
                && !"mocha".equals(type)) {
            return -1;
        }
        double totalBill = 0.0;

        if ("small".equals(size)) {
            totalBill += 3;
        } else if ("medium".equals(size)) {
            totalBill += 4;
        } else {
            totalBill += 5;
        }

        if ("latte".equals(type)) {
            totalBill += 1;
        } else if ("cappuccino".equals(type)) {
            totalBill += 1.5;
        } else if ("mocha".equals(type)) {
            totalBill += 2;
        }

        if (extras.whippedCream()) {
            totalBill += 0.5;
        }

        if (extras.extraShot()) {
            totalBill += 0.75;
        }

        return Math.round(totalBill * 100.0) / 100.0;

    }
}