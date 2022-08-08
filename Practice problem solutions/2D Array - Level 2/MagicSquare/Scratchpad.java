/* This is the Scratchpad!
This file is not graded, but you can use it to test your code.

You can write and test your method in the Scratchpad, but make
sure to copy and paste it into the Unit Test file before checking
your answer. Remember to only copy and paste the method you want
to submit, not all of your tests.
*/

public class Scratchpad
{
    public static void main(String[] args)
    {
        // Add your own tests here
    }

    public static boolean magical(int[][] square)
{
    return true;
}

public static int checkRow(int[][] square, int row) {
    int sum = 0;
    for (int i = 0; i < square.length; i++) {
        sum += square[row][i];
    }
    return sum;
}

public static int checkCol(int[][] square, int col) {
    int sum = 0;
    for (int i = 0; i < square.length; i++) {
        sum += square[i][col];
    }
    return sum;
}

public static int checkDiagOne(int[][] square) {
    int sum = 0;
    
    for (int i = 0; i < square.length; i++) {
        sum+=square[i][i];
    }
    
    return sum;
}

public static int checkDiagTwo(int[][] square) {
    int sum = 0;
    
    for (int i = square.length - 1; i >= 0; i--) {
        sum+=square[i][i];
    }
    
    return sum;
}

public static boolean hasRepeats(int[][] square) {
    for (int i = 0; i < square.length; i++) {
        for (int j = 0; j < square.length; j++) {
            int number = square[i][j];
            
            if (i != square.length - 1 || j != square.length - 1) {
                for (int a = i + 1; a < square.length; a++) {
                    for (int b = j + 1; b < square.length; b++) {
                        if (number == square[a][b]) {
                            return true;
                        }
                    }
                }
            }
        }
    }
    return false;
}

}
