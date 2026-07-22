package com.chaicode.conditionals;

/**
 * The Starlight Cinema
 *
 * <p>
 * You've just been hired at Starlight Cinema! Your first task is to build
 * the automated ticket pricing system. The manager hands you a sticky note
 * with the pricing rules scribbled on it:
 *
 * <p>
 * Age Groups:
 * <ul>
 * <li>Children (0–12): $8</li>
 * <li>Teens (13–17): $12</li>
 * <li>Adults (18–59): $15</li>
 * <li>Seniors (60+): $10</li>
 * </ul>
 *
 * <p>
 * Weekend Surcharge:
 * <ul>
 * <li>Add $3 on weekends (when isWeekend is true)</li>
 * </ul>
 *
 * <p>
 * Rules:
 * <ul>
 * <li>If age is negative, return -1</li>
 * <li>isWeekend is a boolean</li>
 * </ul>
 *
 * @param age       the customer's age
 * @param isWeekend whether it's a weekend
 * @return the ticket price, or -1 for invalid input
 */
public final class TicketPricing {

    private TicketPricing() {
    }

    public static int getTicketPrice(int age, boolean isWeekend) {
    if (age < 0) {
        return -1;
    }

    if (age <= 12) {
        return isWeekend ? 11 : 8;
    } else if (age <= 17) {
        return isWeekend ? 15 : 12;
    } else if (age <= 59) {
        return isWeekend ? 18 : 15;
    } else {
        return isWeekend ? 13 : 10;
    }
}
}
