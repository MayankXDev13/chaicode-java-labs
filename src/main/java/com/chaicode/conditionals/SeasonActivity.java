package com.chaicode.conditionals;

import com.chaicode.conditionals.model.SeasonActivityResult;

/**
 * WanderLust Travel Planner
 *
 * <p>
 * WanderLust is a travel planning app that suggests fun activities
 * based on the month and the current temperature. Users enter the
 * month number and temperature, and the app recommends what to do!
 *
 * <p>
 * Step 1 — Determine the season from the month:
 * <ul>
 * <li>December, January, February (12, 1, 2) → "Winter"</li>
 * <li>March, April, May (3, 4, 5) → "Spring"</li>
 * <li>June, July, August (6, 7, 8) → "Summer"</li>
 * <li>September, October, November (9, 10, 11) → "Autumn"</li>
 * </ul>
 *
 * <p>
 * Step 2 — Suggest an activity based on season AND temperature (°C):
 * <ul>
 * <li>Winter + temp &lt; 0 → "skiing"</li>
 * <li>Winter + temp &gt;= 0 → "ice skating"</li>
 * <li>Spring + temp &gt; 20 → "hiking"</li>
 * <li>Spring + temp &lt;= 20 → "museum visit"</li>
 * <li>Summer + temp &gt; 35 → "swimming"</li>
 * <li>Summer + temp &lt;= 35 → "cycling"</li>
 * <li>Autumn + temp &gt; 15 → "nature walk"</li>
 * <li>Autumn + temp &lt;= 15 → "reading at a cafe"</li>
 * </ul>
 *
 * <p>
 * Return a {@link SeasonActivityResult}: { season, activity }
 *
 * <p>
 * Rules:
 * <ul>
 * <li>If month is not 1–12, return null</li>
 * </ul>
 *
 * @param month       month of the year (1-12)
 * @param temperature current temperature in Celsius
 * @return season and activity, or null for invalid month
 */
public final class SeasonActivity {

    private SeasonActivity() {
    }

    public static SeasonActivityResult getSeasonActivity(int month, int temperature) {
        if (month < 1 || month > 12) {
            return null;
        }

        // Winter
        if (month == 12 || month == 1 || month == 2) {
            if (temperature < 0) {
                return new SeasonActivityResult("Winter", "skiing");
            } else if (temperature >= 0) {
                return new SeasonActivityResult("Winter", "ice skating");
            }
        }
        // Spring
        else if (month == 3 || month == 4 || month == 5) {
            if (temperature > 20) {
                return new SeasonActivityResult("Spring", "hiking");
            } else if (temperature <= 20) {
                return new SeasonActivityResult("Spring", "museum visit");
            }
        }
        // Summer
        else if (month == 6 || month == 7 || month == 8) {
            if (temperature > 35) {
                return new SeasonActivityResult("Summer", "swimming");
            } else if (temperature <= 35) {
                return new SeasonActivityResult("Summer", "cycling");
            }
        }
        // Autumn
        else if (month == 9 || month == 10 || month == 11) {
            if (temperature > 15) {
                return new SeasonActivityResult("Autumn", "nature walk");
            } else if (temperature <= 15) {
                return new SeasonActivityResult("Autumn", "reading at a cafe");
            }
        }
        return null;
    }
}
