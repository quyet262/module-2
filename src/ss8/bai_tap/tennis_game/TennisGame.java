package ss8.bai_tap.tennis_game;

public class TennisGame {
    public static String getScore(Player player1, Player player2) {
        if (ScoreCalculator.isScoreEqual(player1, player2)) {
            return ScoreDescription.getEqualScore(player1.getScore());
        } else if (ScoreCalculator.isAdvantageOrWin(player1, player2)) {
            return ScoreCalculator.getAdvantageOrWinScore(player1, player2);
        } else {
            return ScoreCalculator.getRunningScore(player1, player2);
        }
    }

    public static void main(String[] args) {
        Player player1 = new Player("player1", 3);
        Player player2 = new Player("player2", 2);

        System.out.println(getScore(player1, player2)); // Output: Forty-Thirty
    }
}