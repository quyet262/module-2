package ss8.bai_tap.tennis_game;

class ScoreCalculator implements TennisConstants {

    public static boolean isScoreEqual(Player player1, Player player2) {
        return player1.getScore() == player2.getScore();
    }

    public static boolean isAdvantageOrWin(Player player1, Player player2) {
        return player1.getScore() >= WINNING_SCORE || player2.getScore() >= WINNING_SCORE;
    }

    public static String getAdvantageOrWinScore(Player player1, Player player2) {
        int minusResult = player1.getScore() - player2.getScore();
        if (minusResult == ADVANTAGE_MARGIN) {
            return "Advantage " + player1.getName();
        } else if (minusResult == -ADVANTAGE_MARGIN) {
            return "Advantage " + player2.getName();
        } else if (minusResult >= WIN_MARGIN) {
            return "Win for " + player1.getName();
        } else {
            return "Win for " + player2.getName();
        }
    }

    public static String getRunningScore(Player player1, Player player2) {
        return ScoreDescription.getScoreDescription(player1.getScore()) + "-" + ScoreDescription.getScoreDescription(player2.getScore());
    }
}
