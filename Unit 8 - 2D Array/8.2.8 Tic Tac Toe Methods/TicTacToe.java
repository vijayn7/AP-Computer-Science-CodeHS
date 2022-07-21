public class TicTacToe
{
   //copy over your constructor from the Tic Tac Toe Board activity in the previous lesson!
   private int turn;
   private String[][] board = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
   
   //this method returns the current turn
   public int getTurn()
   {
       return turn;
   }
   
   /*This method prints out the board array on to the console
   */
   public void printBoard()
   {
       System.out.println("  0 1 2");
       for (int row = 0; row < board.length; row++) {
           System.out.print(row + " ");
           for (int col = 0; col < board[row].length; col++) {
               System.out.print(board[row][col] + " ");
           }
           System.out.println();
       }
   }
   
   //This method returns true if space row, col is a valid space
   public boolean pickLocation(int row, int col)
   {
       if(board[row][col] == "-")
       {
           return true;
       }
       return false;
   }
   
   //This method places an X or O at location row,col based on the int turn
   public void takeTurn(int row, int col)
   {
       if (pickLocation(row, col)) {
           turn++;
           if (turn % 2 == 1) {
               board[row][col] = "X";
           } else {
               board[row][col] = "O";
           }
       }
   }
   
   //This method returns a boolean that returns true if a row has three X or O's in a row
   public boolean checkRow()
   {
       for (int row = 0; row < board.length; row++) {
           int x = 0;
           int o = 0;
           for (String col : board[row]) {
               if (col.equals("X")) {
                   x++;
               }
               if (col.equals("O")) {
                   o++;
               }
           }
           if (x == 3 || o == 3) {
               return true;
           }
       }
       return false;
   }
   
    //This method returns a boolean that returns true if a col has three X or O's
   public boolean checkCol()
   {
       for (int row = 0; row < board.length; row++) {
           int x = 0;
           int o = 0;
           for (int col = 0; col < board[row].length; col++) {
               if (board[col][row].equals("X")) {
                   x++;
               }
               if (board[col][row].equals("O")) {
                   o++;
               }
           }
           if (x == 3 || o == 3) {
               return true;
           }
       }
       return false;
   }
   
    //This method returns a boolean that returns true if either diagonal has three X or O's
   public boolean checkDiag()
   {
       if(board[0][0] == "X" && board[1][1] == "X" && board[2][2] == "X") {
           return true;
       }
       else if(board[0][0] == "O" && board[1][1] == "O" && board[2][2] == "O") {
           return true;
       }
       return false;
   }
   
   //This method returns a boolean that checks if someone has won the game
   public boolean checkWin()
   {
       if(checkDiag() || checkCol() || checkRow())
       {
           return true;
       }
       return false;
   }

}