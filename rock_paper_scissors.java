// ACTIVITY 7

import java.util.Scanner;

public class rock_paper_scissors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

    String RESET = "\u001B[0m";
    String RED = "\u001B[31;1m";
    String GREEN = "\u001B[32;1m";
    String CYAN = "\u001B[36;1m";
    String PURPLE = "\u001B[35;1m";
    String BLUE = "\u001B[34;1m";
    String YELLOW = "\u001B[33;1m";

        int player1Score = 0;
        int player2Score = 0;
        int ties = 0;
        boolean gameRunning = true;

        System.out.println("Welcome to the Two-Player Rock-Paper-Scissors Duel!\n");
        System.out.println("(Enter" +BLUE+ " r=Rock, " +GREEN+ "p=Paper, " +PURPLE+ "s=Scissors," +RED+ " q=Quit)\n" + RESET);
        System.out.println("----------------------------------------------------\n");

        while (gameRunning) {
            String player1Move = "";
            String player2Move = "";

            // ----- Player 1 Input -----
            while (true) {
                System.out.print(CYAN + "Player 1, enter your move: "+RESET);
                player1Move = scan.nextLine().trim().toLowerCase();

                if (player1Move.equals("r") || player1Move.equals("p") || player1Move.equals("s") || player1Move.equals("q")) {
                    break;
                } else {
                    System.out.println(RED+"\nInvalid input. Please enter [ r | p | s | q ] only.\n"+RESET);
                }
            }

            // Quit check for player 1
            if (player1Move.equals("q")) {
                System.out.println("\nPlayer 1 quit the game.\n--- Match Ended ---\n");
                break;
            }

            // ----- Player 2 Input -----
            while (true) {
                System.out.print(YELLOW+"Player 2, enter your move: "+RESET);
                player2Move = scan.nextLine().trim().toLowerCase();

                if (player2Move.equals("r") || player2Move.equals("p") || player2Move.equals("s") || player2Move.equals("q")) {
                    break;
                } else {
                    System.out.println(RED+"\nInvalid input. Please enter [ r | p | s | q ] only.\n"+RESET);
                }
            }

            // Quit check for player 2
            if (player2Move.equals("q")) {
                System.out.println("\nPlayer 2 quit the game.\n--- Match Ended ---\n");
                break;
            }

            // ----- Determine Winner -----
            if (player1Move.equals(player2Move)) {
                System.out.println("\nResult: It's a Tie!");
                ties++;
            } else if (
                (player1Move.equals("r") && player2Move.equals("s")) ||
                (player1Move.equals("p") && player2Move.equals("r")) ||
                (player1Move.equals("s") && player2Move.equals("p"))
            ) {
                System.out.print("\nResult: Player 1 Wins! ");
                if (player1Move.equals("r")) System.out.println("Rock crushes Scissors.");
                else if (player1Move.equals("p")) System.out.println("Paper covers Rock.");
                else System.out.println("Scissors cut Paper.");
                player1Score++;
            } else {
                System.out.print("\nResult: Player 2 Wins! ");
                if (player2Move.equals("r")) System.out.println("Rock crushes Scissors.");
                else if (player2Move.equals("p")) System.out.println("Paper covers Rock.");
                else System.out.println("Scissors cut Paper.");
                player2Score++;
            }

            // ----- Display Score -----
            System.out.println("\nScore: P1: " + player1Score + " | P2: " + player2Score + " | Ties: " + ties);
            System.out.println();
        }

        // ----- Final Results -----
        System.out.println("\nFinal Score: Player 1: " + player1Score + " wins | Player 2: " + player2Score + " wins | " + ties + " ties.");
        if (player1Score > player2Score)
            System.out.println(CYAN+"\nPlayer 1 is the overall winner!"+RESET);
        else if (player2Score > player1Score)
            System.out.println(YELLOW+"\nPlayer 2 is the overall winner!"+RESET);
        else
            System.out.println(GREEN+"\nThe match ends in a tie!"+RESET);

        System.out.println("\nThanks for playing!\n");
        scan.close();
    }
}
