import java.util.Scanner;
public class Player
{
    // instance variables
    private String mark;    // holds "X" or "O" for this player
    private int numWins;
    private int numLosses;
    private int numTies;
    
    // Constructor
    public Player()
    {
        mark = " ";
        numWins = 0;
        numLosses = 0;
        numTies = 0;
    }
    
    /* 
     * This is the method you'll want to modify to make the computer choose the squares instead
     * of getting input from a human. This method must choose an integer between 1 and 9, and it
     * must be a square which has not already been taken. To find out what mark is in any given
     * square, your method can use the getMark(squareNum) method from the Board class. This method
     * returns a string with an "X", "O", or " ".
     */
    public int chooseSquare()
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Which square do you choose (1 - 9)? ");
        int square = reader.nextInt();
        return square;
    }
    
    public String toString()
    {
        return "Mark: " + mark + "\nWins: " + numWins + "   Losses: " + numLosses + "   Ties: " + numTies;
    }
    
    // Below are all the "getter" and "setter" methods
    public void setMark(String mrk)
    {
        mark = mrk;
    }
    public String getMark()
    {
        return mark;
    }
    public void addWin()
    {
        numWins++;
    }
    public void addLoss()
    {
        numLosses++;
    }
    public void addTie()
    {
        numTies++;
    }
    public int getWins()
    {
        return numWins;
    }
    public int getLosses()
    {
        return numLosses;
    }
    public int getTies()
    {
        return numTies;
    }    
}
