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
        boolean gameover;
        String winner = null;
        Scanner in = new Scanner(System.in);

        System.out.println("Player 1, what is your name?");
        String player1 = in.nextLine();

        System.out.println("Player 2, what is your name?");
        String player2 = in.nextLine();

        System.out.println(player1 + " vs. " + player2);
        char[][] gameboard = new char[3][3];

        System.out.println("Board:");
        System.out.println("    A | B | C ");
        for (int row = 0; row < gameboard.length; row++ ) {
            System.out.println("---------------");
            System.out.print(row);
            for (int col = 0; col < gameboard[row].length; col++) {
                gameboard[row][col] = '_';
                System.out.print(" | " + gameboard[row][col]);
            }
            System.out.println(" |");
        }
        System.out.println("---------------");

        while (gameover = false) {
            return;
        }
        System.out.println("Game over, " + player1 + " wins!");
    }
}