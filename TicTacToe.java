/*
 * This class allows two players to play one or more games of Tic Tac Toe. It controls
 * the flow of the games. Initially it creates two players and it makes a new board for
 * each new game.
 */

import java.util.Scanner;
public class TicTacToe
{
    // instance variables
    private Player p1;
    private Player p2;
    private Board board;
    private BoardViewer viewer;

    // Constructor
    public TicTacToe()
    {
        p1 = new Player();
        p2 = new Player();
        viewer = new BoardViewer();
    }

    // Method
    public void playTicTacToe()
    {
        // Players choose "X" and "O" for their marks
        Scanner reader = new Scanner(System.in);
        System.out.print("Player 1, do you want to be \"X\" or \"O\"? ");
        String p1Mark = reader.nextLine();
        if (p1Mark.equals("X") || p1Mark.equals("x"))
        {
            p1.setMark("X");
            p2.setMark("O");
        }
        else
        {
            p2.setMark("X");
            p1.setMark("O");
        }
        System.out.println("Player 2, you will be \"" + p2.getMark() + "\".\n");

        // Begin play
        int gameNumber = 0;
        boolean playAgain = true;
        while (playAgain)
        {
            gameNumber++;   // hold the number of games that have been played
            boolean gameOver = false;
            board = new Board();        // Initially board shows locations of squares 1 - 9
            viewer.showBoard(board);    
            board.clearBoard();         // Resets all squares to be blank for the beginning of the game.
            while (!gameOver)
            {
                int move = 0;        // holds the square a player chooses
                boolean validMove = false;  // gets set to 0 if player chooses an open square
                String win = null;    // gets set to "X" or "O" when a player wins
                if (gameNumber % 2 == 1 || board.getNumFullSquares() > 0)  // Allows Player #2 to go first in even numbered games
                {
                    // Process player #1's move
                    System.out.print("Player 1: ");
                    move = p1.chooseSquare();
                    validMove = board.markSquare(move, p1.getMark());   // sets specific square with "X" or "O"
                    if (!validMove)    // validMove returns -1 if the square is already filled
                    {
                        System.out.println("Invalid entry. Game over.\n");
                        gameOver = true;
                        break;
                    }
                    viewer.showBoard(board);
                    win = board.checkForWin();   // returns "X" or "O" if that player has won
                    if (win != null)
                    {
                        p1.addWin();
                        System.out.println("Player 1 wins!\n");
                        p2.addLoss();
                        gameOver = true;
                        break;
                    }
                    if (board.getNumFullSquares() == 9)
                    {
                        System.out.println("Tie Game!\n");
                        p1.addTie();
                        p2.addTie();
                        gameOver = true;
                        break;
                    }
                }

                // Process Player #2's move
                System.out.print("Player 2: ");
                move = p2.chooseSquare();
                System.out.println();
                validMove = board.markSquare(move, p2.getMark());
                if (!validMove)    // if square is not open, game ends
                {
                    System.out.println("Invalid entry. Game over.\n");
                    gameOver = true;
                    break;
                }
                viewer.showBoard(board);
                win = board.checkForWin();
                if (win != null)
                {
                    p2.addWin();
                    System.out.println("Player 2 wins!\n");
                    p1.addLoss();
                    gameOver = true;
                    break;
                }
                if (board.getNumFullSquares() == 9)
                {
                    System.out.println("Tie Game!\n");
                    p1.addTie();
                    p2.addTie();
                    gameOver = true;
                }
            }

            System.out.println("Player 1 has " + p1.getWins() + " wins.");
            System.out.println("Player 2 has " + p2.getWins() + " wins.\n");
            System.out.print("Would y'all like to play again? (Yes or No) ");
            String response = reader.nextLine();
            if (response.equals("No") || response.equals("no"))
            {
                playAgain = false;
            }
        }
    }
}
