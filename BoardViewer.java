/*
 * The BoardViewer is written as a separate class in case someone wants to
 * implement a graphical user interface instead of terminal output. It is 
 * good programming practice to have separate classes for processing (modeling)
 * the data and for viewing it.
 */

public class BoardViewer
{
    public BoardViewer()
    {

    }

    public void showBoard(Board board)
    {
        String line = "-------------------";
        String bars = "|     |     |     |";

        System.out.println(line);
        System.out.println(bars);
        System.out.println("|  " + board.getMark(1) + "  |  " + board.getMark(2) + "  |  " + board.getMark(3) + "  |");
        System.out.println(bars);
        System.out.println(line);
        System.out.println(bars);
        System.out.println("|  " + board.getMark(4) + "  |  " + board.getMark(5) + "  |  " + board.getMark(6) + "  |");
        System.out.println(bars);
        System.out.println(line);
        System.out.println(bars);
        System.out.println("|  " + board.getMark(7) + "  |  " + board.getMark(8) + "  |  " + board.getMark(9) + "  |");
        System.out.println(bars);
        System.out.println(line);
    }
}
