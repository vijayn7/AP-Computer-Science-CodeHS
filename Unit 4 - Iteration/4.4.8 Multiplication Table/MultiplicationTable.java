public class MultiplicationTable
{
    public static void main(String[] args)
    {
        // Call makeMultiplicationTable 
       makeMultiplicationTable();
    }
    
    // Makes a multiplcation table
    public static void makeMultiplicationTable()
    {
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                System.out.print(x*y + "\t");
            }
            System.out.println();
        }
    }
}