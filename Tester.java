public class Tester
{
    public static void main (String[] args)
    {
        Board game = new Board();
        System.out.println(game);
        game.clearBoard();
        System.out.println(game.getMark(3));
        
    }
}