import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

/*
- ask each player for their name
- use a loop to print the game board
- toggle between the users
- ask the next person where you want to play
    - 2 dimensional array of chars with possible values blank, x, or o
    - first array a, b, or c for row
    - second array 1, 2, 3 for column

- check if someone won
- due on weds

*/
        boolean gameover = false;
        String winner = null;
        Scanner in = new Scanner(System.in);

        System.out.println("Player X, what is your name?");
        String playerX = in.nextLine();

        System.out.println("Player O, what is your name?");
        String playerO = in.nextLine();

        String currentPlayer = playerX;
        String currentMark = "X";

        System.out.println(playerX + " (X) vs. " + playerO + " (O)");
        String[][] gameboard = new String[][]{
            {"_", "_", "_"},
            {"_", "_", "_"},
            {"_", "_", "_"}
        };

        while (gameover == false) {

            System.out.println("Board:");
            System.out.println("    A | B | C ");
            for (int row = 0; row < gameboard.length; row++ ) {
                System.out.println("---------------");
                System.out.print(row + 1);
                for (int col = 0; col < gameboard[row].length; col++) {
                    // gameboard[row][col] = "_";
                    System.out.print(" | " + gameboard[row][col]);
                }
                System.out.println(" |");
            }
            System.out.println("---------------");

            System.out.println(currentPlayer + ", it's your turn. Select a square for " + currentMark);

            boolean validcoords = true;
            boolean validsquare = true;

            String move = in.nextLine();

            int colposition = 0;
            int rowposition = 0;

            if (move.charAt(0) == 'A' || move.charAt(0) == 'a') {
                colposition = 0;
            } else if (move.charAt(0) == 'B' || move.charAt(0) == 'b') {
                colposition = 1;
            } else if (move.charAt(0) == 'C' || move.charAt(0) == 'c') {
                colposition = 2;
            } else {
                validcoords = false;
            }

            rowposition = move.charAt(1) - '1';

            if (gameboard[rowposition][colposition] == "X" || gameboard[rowposition][colposition] == "O") {
                validsquare = false;
            }

            if (validcoords == false) {
                System.out.println("Whoops! Please select a valid square (e.g. A2)");
                move = in.nextLine();
            }
            if (validsquare == false) {
                System.out.println("Whoops! Please select an empty square");
                move = in.nextLine();
            }

            if (validcoords == true && validsquare == true) {
                gameboard[rowposition][colposition] = currentMark;

                String a1 = gameboard[0][0],
                       a2 = gameboard[1][0],
                       a3 = gameboard[2][0],
                       b1 = gameboard[0][1],
                       b2 = gameboard[1][1],
                       b3 = gameboard[2][1],
                       c1 = gameboard[0][2],
                       c2 = gameboard[1][2],
                       c3 = gameboard[2][2];

                boolean winningmove = (a1.equals(currentMark) && a2.equals(currentMark) && a3.equals(currentMark)) ||
                                      (b1.equals(currentMark) && b2.equals(currentMark) && b3.equals(currentMark)) ||
                                      (c1.equals(currentMark) && c2.equals(currentMark) && c3.equals(currentMark)) ||
                                      (a1.equals(currentMark) && b1.equals(currentMark) && c1.equals(currentMark)) ||
                                      (a2.equals(currentMark) && b2.equals(currentMark) && c2.equals(currentMark)) ||
                                      (a3.equals(currentMark) && b3.equals(currentMark) && c3.equals(currentMark)) ||
                                      (a1.equals(currentMark) && b2.equals(currentMark) && c3.equals(currentMark)) ||
                                      (a3.equals(currentMark) && b2.equals(currentMark) && c1.equals(currentMark));

                if (winningmove) {
                    winner = currentPlayer;
                    gameover = true;
                }

                if (currentPlayer == playerX) {
                    currentPlayer = playerO;
                    currentMark = "O";
                } else {
                    currentPlayer = playerX;
                    currentMark = "X";
                }
            }
        }
        System.out.println("Game over, " + winner + " wins!");
    }
}