public class ChessBoard
{
    public static void main(String[] args)
    {
        //Create an 8x8 2D String array called chess.
        String[][] chess = new String[8][8];
        
        String[] specials = {"Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight", "Rook"};
        String[] pawns = {"Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn"};
        String[] spaces = {"-", "-", "-", "-", "-", "-", "-", "-"};
        
        chess[0] = specials;
        chess[1] = pawns;
        chess[2] = spaces;
        chess[3] = spaces;
        chess[4] = spaces;
        chess[5] = spaces;
        chess[6] = pawns;
        chess[7] = specials;
        
        //Use this method to print the chess board onto the console
        print(chess);
        

    }
    
    //Do not make alterations to this method!
    public static void print(String[][] array)
    {
        for(String[] row: array)
        {
            for(String thing: row)
            {
                System.out.print(thing + "\t");
            }
            System.out.println();
        }
    }
}