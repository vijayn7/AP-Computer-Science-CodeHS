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

    public static int[][] reverse(int[][] arr)
{
    int[][] reversed = new int[arr[0].length][arr.length];
    
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            reversed[arr[i].length - 1 - i][arr.length - 1 - j] = arr[i][j];
        }
    }
    return reversed;
}
}
