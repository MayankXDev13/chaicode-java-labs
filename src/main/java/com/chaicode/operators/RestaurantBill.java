package com.chaicode.operators;

/**
 * Bistro 42 Bill Calculator
 *
 * <p>
 * Waitstaff use this to print the final bill. Given the food subtotal, apply
 * tax and tip.
 *
 * <p>
 * Rules:
 * <ul>
 * <li>Tax rate is 8% of subtotal</li>
 * <li>Tip is 15% of (subtotal + tax)</li>
 * <li>Final total = subtotal + tax + tip, rounded to nearest cent using
 * Math.round(total * 100) / 100.0</li>
 * <li>If subtotal is negative, return -1.0</li>
 * </ul>
 *
 * @param subtotal food subtotal in dollars
 * @return final bill total, or -1.0 for invalid input
 */
public final class RestaurantBill {

    private RestaurantBill() {
    }

    public static double calculateTotal(double subtotal) {
        // Your code here

        double tax = subtotal * 0.08;
        double tip = (subtotal + tax) * 0.15;
        double total = Math.round((subtotal + tip + tax) * 100) / 100.0;

        if (total < 0) {
            return -1;
        }
        return total;
    }
}
