package com.chaicode.conditionals;

/**
 * The Driving Simulator
 *
 * <p>
 * SafeDrive Driving School is building a simulator for new students.
 * You need to write the logic that tells student drivers what to do
 * when they encounter different traffic light signals.
 *
 * <p>
 * Signal → Action:
 * <ul>
 * <li>"green" → "GO"</li>
 * <li>"yellow" → "SLOW DOWN"</li>
 * <li>"red" → "STOP"</li>
 * <li>"flashing red" → "STOP AND PROCEED WITH CAUTION"</li>
 * <li>anything else → "INVALID SIGNAL"</li>
 * </ul>
 *
 * <p>
 * Rules:
 * <ul>
 * <li>The function should be case-insensitive
 * (e.g., "GREEN", "Green", "green" should all return "GO")</li>
 * </ul>
 *
 * <p>
 * Hint: Use a switch statement!
 *
 * @param color the traffic light signal
 * @return the driving action to take
 */
public final class TrafficLight {

    private TrafficLight() {
    }

    public static String getTrafficAction(String color) {
        switch (color.toLowerCase()) {
            case "green":
                return "GO";
            case "yellow":
                return "SLOW DOWN";
            case "red":
                return "STOP";
            case "flashing red" :
                return "STOP AND PROCEED WITH CAUTION";
            default:
                return "INVALID SIGNAL";
        }
    }
}
