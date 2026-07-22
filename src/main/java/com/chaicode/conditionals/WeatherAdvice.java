package com.chaicode.conditionals;

/**
 * TrailBuddy - The Hiking Weather App
 *
 * <p>You're building a weather advisory feature for TrailBuddy, a popular
 * hiking app used by thousands of outdoor enthusiasts. Based on the
 * temperature (in Celsius) and whether it's raining, the app should
 * display helpful advice to hikers.
 *
 * <p>Advisory Rules (check in this exact order):
 * <ul>
 *   <li>temp &gt;= 35              → "Too hot for hiking - stay indoors and hydrate"</li>
 *   <li>temp &gt;= 25 and no rain  → "Great weather for hiking - don't forget sunscreen"</li>
 *   <li>temp &gt;= 25 and raining  → "Warm but rainy - consider indoor activities"</li>
 *   <li>temp &gt;= 15 and no rain  → "Perfect hiking weather - enjoy the trails"</li>
 *   <li>temp &gt;= 15 and raining  → "Cool and rainy - bring waterproof gear if hiking"</li>
 *   <li>temp &gt;= 5 and no rain   → "Chilly - wear layers for your hike"</li>
 *   <li>temp &gt;= 5 and raining   → "Cold and wet - best to stay indoors"</li>
 *   <li>temp &lt; 5                → "Too cold - stay warm indoors"</li>
 * </ul>
 *
 * @param temperature temperature in Celsius
 * @param isRaining whether it's currently raining
 * @return the weather advisory message
 */
public final class WeatherAdvice {

    private WeatherAdvice() {}

    public static String getWeatherAdvice(int temperature, boolean isRaining) {
        if (temperature >= 35) {
            return "Too hot for hiking - stay indoors and hydrate";
        } else if (temperature >= 25) {
            return isRaining ? "Warm but rainy - consider indoor activities" : "Great weather for hiking - don't forget sunscreen";
        } else if (temperature >= 15) {
            return isRaining ? "Cool and rainy - bring waterproof gear if hiking" : "Perfect hiking weather - enjoy the trails";
        } else if (temperature >= 5) {
            return isRaining ? "Cold and wet - best to stay indoors" : "Chilly - wear layers for your hike";
        } else {
            return "Too cold - stay warm indoors";
        }
    }
}
