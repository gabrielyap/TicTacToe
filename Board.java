public class Board
{
    private String box1 , box2, box3, box4, box5, box6, box7, box8, box9;
    public Board()
    {
        box1 = "1";
        box2 = "2";
        box3 = "3";
        box4 = "4";
        box5 = "5";
        box6 = "6";
        box7 = "7";
        box8 = "8";
        box9 = "9";
    }
    public void clearBoard()
    {
        box1 = " ";
        box2 = " ";
        box3 = " ";
        box4 = " ";
        box5 = " ";
        box6 = " ";
        box7 = " ";
        box8 = " ";
        box9 = " ";
    }
    public String getMark(int squareNum)
    {
        if (squareNum == 1)
        {
            return box1;
        }
        if (squareNum == 2)
        {
            return box2;
        }
        if (squareNum == 3)
        {
            return box3;
        }
        if (squareNum == 4)
        {
            return box4;
        }
        if (squareNum == 5)
        {
            return box5;
        }
        if (squareNum == 6)
        {
            return box6;
        }
        if (squareNum == 7)
        {
            return box7;
        }
        if (squareNum == 8)
        {
            return box8;
        }
        if (squareNum == 9)
        {
            return box9;
        }
        else
        {
            return null;
        }
    }
    public boolean markSquare(int squareNum, String mark)
    {
        if (squareNum == 1 && box1.equals(" "))
        {
            box1 = mark;
            return true;
        }
        if (squareNum == 2 && box2.equals(" "))
        {
            box2 = mark;
            return true;
        }
        if (squareNum == 3 && box3.equals(" "))
        {
            box3 = mark;
            return true;
        }
        if (squareNum == 4 && box4.equals(" "))
        {
            box4 = mark;
            return true;
        }
        if (squareNum == 5 && box5.equals(" "))
        {
            box5 = mark;
            return true;
        }
        if (squareNum == 6 && box6.equals(" "))
        {
            box6 = mark;
            return true;
        }
        if (squareNum == 7 && box7.equals(" "))
        {
            box7 = mark;
            return true;
        }
        if (squareNum == 8 && box8.equals(" "))
        {
            box8 = mark;
            return true;
        }
        if (squareNum == 9 && box9.equals(" "))
        {
            box9 = mark;
            return true;
        }
        else
        {
            return false;
        }
    }
    public String checkForWin()
    {
        if ((box1.equals("X") && box2.equals("X") && box3.equals("X")) || // top row
        (box4.equals("X") && box5.equals("X") && box6.equals("X")) || //mid row
        (box7.equals("X") && box8.equals("X") && box9.equals("X")) || //bot row
        (box1.equals("X") && box4.equals("X") && box7.equals("X")) || //first col
        (box2.equals("X") && box5.equals("X") && box8.equals("X")) || //sec col
        (box3.equals("X") && box6.equals("X") && box9.equals("X")) || //lst col
        (box1.equals("X") && box5.equals("X") && box9.equals("X")) || //-diag
        (box3.equals("X") && box5.equals("X") && box7.equals("X"))) //+diag
        {
            return "X";
        }
        if ((box1.equals("O") && box2.equals("O") && box3.equals("O")) || // top row
        (box4.equals("O") && box5.equals("O") && box6.equals("O")) || //mid row
        (box7.equals("O") && box8.equals("O") && box9.equals("O")) || //bot row
        (box1.equals("O") && box4.equals("O") && box7.equals("O")) || //first col
        (box2.equals("O") && box5.equals("O") && box8.equals("O")) || //sec col
        (box3.equals("O") && box6.equals("O") && box9.equals("O")) || //lst col
        (box1.equals("O") && box5.equals("O") && box9.equals("O")) || //-diag
        (box3.equals("O") && box5.equals("O") && box7.equals("O"))) //+diag
        {
            return "O";
        }
        else
        {
            return null;
        }
    }
    int getNumFullSquares()
    {
        int fullSquares = 0;
        if (!(box1.equals(" ")))    //if the box isn't empty, adds to
                                    //total amount of fullSquares
        {
            fullSquares++ ;
        }
        if (!(box2.equals(" ")))
        {
            fullSquares++ ;
        }
        if (!(box3.equals(" ")))
        {
            fullSquares++ ;
        }
        if (!(box4.equals(" ")))
        {
            fullSquares++ ;
        }
        if (!(box5.equals(" ")))
        {
            fullSquares++ ;
        }
        if (!(box6.equals(" ")))
        {
            fullSquares++ ;
        }
        if (!(box7.equals(" ")))
        {
            fullSquares++ ;
        }
        if (!(box8.equals(" ")))
        {
            fullSquares++ ;
        }
        if (!(box9.equals(" ")))
        {
            fullSquares++ ;
        }
        return fullSquares;
    }
    public String toString()
    {
        return "box1 , box2, box3, box4, box5, box6, box7, box8, box9";
    }
}
