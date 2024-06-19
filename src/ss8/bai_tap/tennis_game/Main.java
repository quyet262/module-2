package ss8.bai_tap.tennis_game;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name of player 1: ");
        String player1Name = scanner.nextLine();
        System.out.print("Enter score of player 1: ");
        int player1Score = scanner.nextInt();

        System.out.print("Enter name of player 2: ");
        scanner.nextLine();  // consume newline
        String player2Name = scanner.nextLine();
        System.out.print("Enter score of player 2: ");
        int player2Score = scanner.nextInt();

        Player player1 = new Player(player1Name, player1Score);
        Player player2 = new Player(player2Name, player2Score);

        TennisGame game = new TennisGame();
        String score = game.getScore(player1, player2);

        System.out.println("Current score: " + score);
    }
}