package com.chaicode.conditionals;

/**
 * City Central Parking
 *
 * <p>
 * City Central Parking garage is the busiest in downtown. They need an
 * automated system to calculate parking fees. Different vehicle types
 * have different rates, and there's a daily maximum so customers
 * aren't overcharged.
 *
 * <p>
 * Rates (first hour / each additional hour):
 * <ul>
 * <li>"car": $5 first hour, then $3/hour</li>
 * <li>"motorcycle": $3 first hour, then $2/hour</li>
 * <li>"bus": $10 first hour, then $7/hour</li>
 * </ul>
 *
 * <p>
 * Daily Maximum (fee can never exceed this):
 * <ul>
 * <li>"car": $30</li>
 * <li>"motorcycle": $18</li>
 * <li>"bus": $60</li>
 * </ul>
 *
 * <p>
 * Rules:
 * <ul>
 * <li>Partial hours are rounded UP (e.g., 1.5 hours → 2 hours)</li>
 * <li>The fee should never exceed the daily maximum</li>
 * <li>If hours is 0 or negative, return -1</li>
 * <li>If vehicleType is not "car", "motorcycle", or "bus", return -1</li>
 * </ul>
 *
 * <p>
 * Examples:
 * <ul>
 * <li>car, 1 hour → $5</li>
 * <li>car, 3 hours → $5 + $3 + $3 = $11</li>
 * <li>car, 0.5 hours → rounds up to 1 hour → $5</li>
 * <li>car, 24 hours → $5 + 23×$3 = $74 → capped at $30</li>
 * </ul>
 *
 * @param hours       number of hours parked
 * @param vehicleType "car", "motorcycle", or "bus"
 * @return parking fee or -1 for invalid input
 */
public final class ParkingFee {

    private ParkingFee() {
    }

    public static int calculateParkingFee(double hours, String vehicleType) {

        if (hours <= 0 ||
                (!"car".equals(vehicleType)
                        && !"motorcycle".equals(vehicleType)
                        && !"bus".equals(vehicleType))) {
            return -1;
        }
        int totalHours = (int) Math.ceil(hours);
        int fee = 0;

        if ("car".equals(vehicleType)) {
            fee = 5 + (totalHours - 1) * 3;
            fee = Math.min(fee, 30);
        } else if ("motorcycle".equals(vehicleType)) {
            fee = 3 + (totalHours - 1) * 2;
            fee = Math.min(fee, 18);
        } else {
            fee = 10 + (totalHours - 1) * 7;
            fee = Math.min(fee, 60);
        }

        return fee;

    }
}
