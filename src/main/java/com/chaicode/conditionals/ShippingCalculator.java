package com.chaicode.conditionals;

/**
 * ShopSwift Shipping Calculator
 *
 * <p>
 * ShopSwift is a growing online store. They've hired you to build their
 * shipping cost calculator. The cost depends on the package weight,
 * where it's going, and the order total.
 *
 * <p>
 * Domestic Shipping (country equals "US"):
 * <ul>
 * <li>Weight up to 1 kg: $5</li>
 * <li>Weight up to 5 kg: $10</li>
 * <li>Weight over 5 kg: $15</li>
 * </ul>
 *
 * <p>
 * International Shipping (any other country):
 * <ul>
 * <li>Weight up to 1 kg: $15</li>
 * <li>Weight up to 5 kg: $25</li>
 * <li>Weight over 5 kg: $40</li>
 * </ul>
 *
 * <p>
 * Free Shipping:
 * <ul>
 * <li>Domestic orders over $50 get FREE shipping (return 0)</li>
 * <li>International orders over $100 get FREE shipping (return 0)</li>
 * </ul>
 *
 * <p>
 * Rules:
 * <ul>
 * <li>If weight is 0 or negative, return -1</li>
 * <li>If orderTotal is negative, return -1</li>
 * </ul>
 *
 * @param weight     package weight in kilograms
 * @param country    destination country code (e.g., "US", "UK", "IN")
 * @param orderTotal total order amount in dollars
 * @return shipping cost, 0 for free shipping, or -1 for invalid input
 */
public final class ShippingCalculator {

    private ShippingCalculator() {
    }

    public static int calculateShipping(double weight, String country, double orderTotal) {

        if (weight <= 0) {
            return -1;
        } else if (orderTotal <= 0) {
            return -1;
        }
        if ("US".equals(country)) {
            if (orderTotal > 50) {
                return 0;
            }
            if (weight <= 1) {
                return 5;
            } else if (weight <= 5) {
                return 10;
            } else {
                return 15;
            }
        } else {
            if (orderTotal > 100) {
                return 0;
            }
            if (weight <= 1) {
                return 15;
            } else if (weight <= 5) {
                return 25;
            } else {
                return 40;
            }
        }

    }
}
