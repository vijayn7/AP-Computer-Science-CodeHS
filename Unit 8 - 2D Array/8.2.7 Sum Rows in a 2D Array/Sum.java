public class Sum
{
    public static void main(String[] args)
    {
        int[][] array = {{32, 4, 14, 65, 23, 6},
                        {4, 2, 53, 31, 765, 34},
                        {64235, 23, 522, 124, 42, 64}};
                        
        System.out.println(sumRow(array, 0));
        System.out.println(sumRow(array, 1));
        System.out.println(sumRow(array, 2));
    }
    
    public static int sumRow(int[][] array, int row)
    {
        int sum = 0;
        for (int col = 0; col < array[row].length; col++) {
            sum += array[row][col];
        }
        return sum;
    }
}