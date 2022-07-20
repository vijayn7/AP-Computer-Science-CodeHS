public class TreeOfStars
{
    public static void main(String[] args)
    {
       // Call makeATree 
       makeATree();
    }
    public static void makeATree()
    {
        // Your code goes here!!!
        for (int j = 1; j < 11; j++){
            
            printSpaces(10-j+2);
            for (int i = 1; i < j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printSpaces(int i) {
        for (int k = i; k > 0; k--) {
            System.out.print(" ");
        }
    }
}