public class TicTacToe
{
    private String[][] board;
    
    public TicTacToe() {
        String [][] temp = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
        board = temp;
    }
    
    public String[][] getBoard() {
        return board;
    }
}