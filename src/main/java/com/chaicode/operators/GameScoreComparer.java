package com.chaicode.operators;

/**
 * Arena Clash Scoreboard
 *
 * <p>
 * Two players compete in an online game. Each has a base score and a bonus
 * multiplier.
 * Effective score = baseScore + (baseScore * bonusPercent / 100) using integer
 * arithmetic
 * (bonus added as whole points: baseScore * bonusPercent / 100).
 *
 * <p>
 * Return:
 * <ul>
 * <li>"Player 1 wins" if player1 effective score is higher</li>
 * <li>"Player 2 wins" if player 2 is higher</li>
 * <li>"Tie" if equal</li>
 * </ul>
 *
 * <p>
 * If any base score is negative or bonus percent is not 0–100, return
 * "Invalid".
 *
 * @param p1Base  player 1 base score
 * @param p1Bonus player 1 bonus percent
 * @param p2Base  player 2 base score
 * @param p2Bonus player 2 bonus percent
 * @return match result string
 */
public final class GameScoreComparer {

    private GameScoreComparer() {
    }

    public static String compareScores(int p1Base, int p1Bonus, int p2Base, int p2Bonus) {
        // Your code here

        if (p1Base < 0 || p1Bonus < 0 || p1Bonus > 100 || p2Base < 0 || p2Bonus < 0 || p2Bonus > 100) {
            return "Invalid";

        }
        int p1BonusScore = (p1Base * p1Bonus / 100);
        int p1EffectiveScore = p1Base + p1BonusScore;

        int p2BonusScore = (p2Base * p2Bonus / 100);
        int p2EffectiveScore = p2Base + p2BonusScore;

        if (p1EffectiveScore > p2EffectiveScore) {
            return "Player 1 wins";
        } else if (p2EffectiveScore > p1EffectiveScore) {
            return "Player 2 wins";
        } else {
            return "Tie";
        }

    }
}
