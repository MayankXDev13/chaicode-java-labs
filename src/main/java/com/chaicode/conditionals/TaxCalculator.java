package com.chaicode.conditionals;

/**
 * Sam's Tax Calculator
 *
 * <p>
 * Sam is a freelance graphic designer who dreads tax season every year.
 * Help Sam by building a tax calculator that uses progressive tax brackets.
 *
 * <p>
 * How progressive tax works:
 * You don't pay the same rate on ALL your income. Each "slice" of income
 * is taxed at its own rate:
 *
 * <ul>
 * <li>Bracket 1: $0 – $10,000 → 0% (tax-free!)</li>
 * <li>Bracket 2: $10,001 – $30,000 → 10% (only on the amount ABOVE
 * $10,000)</li>
 * <li>Bracket 3: $30,001 – $70,000 → 20% (only on the amount ABOVE
 * $30,000)</li>
 * <li>Bracket 4: Over $70,000 → 30% (only on the amount ABOVE $70,000)</li>
 * </ul>
 *
 * <p>
 * Examples:
 * <ul>
 * <li>Income $8,000 → Tax = $0 (all in bracket 1)</li>
 * <li>Income $20,000 → Tax = 10% of ($20,000 - $10,000) = $1,000</li>
 * <li>Income $50,000 → Tax = $2,000 + 20% of ($50,000 - $30,000) = $6,000</li>
 * <li>Income $100,000 → Tax = $2,000 + $8,000 + 30% of ($100,000 - $70,000) =
 * $19,000</li>
 * </ul>
 *
 * <p>
 * Rules:
 * <ul>
 * <li>If income is 0 or negative, return 0</li>
 * </ul>
 *
 * @param income annual income in dollars
 * @return total tax amount owed
 */
public final class TaxCalculator {

    private TaxCalculator() {
    }

    public static double calculateTax(double income) {

        if (income <= 0) {
            return 0;
        }

        double tax = 0;

        if (income <= 10000) {
            tax = 0;
        } else if (income <= 30000) {
            tax = (income - 10000) * 0.10;
        } else if (income <= 70000) {
            tax = 2000 + (income - 30000) * 0.20;
        } else {
            tax = 2000 + 8000 + (income - 70000) * 0.30;
        }

        return tax;
    }
}
