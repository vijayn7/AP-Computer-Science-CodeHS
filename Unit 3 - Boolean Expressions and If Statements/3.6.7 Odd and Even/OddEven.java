public class OddEven
{
    // Determines if num1 and num2 are both ODD
    public static boolean bothOdd(int n1, int n2)
    {
        return !(n1 % 2 == 0 || n2 % 2 == 0);
    }
    
    // Determines if num1 and num2 are both EVEN 
    public static boolean bothEven(int n1, int n2)
    {
        return (n1 % 2 == 0) && (n2 % 2 == 0);
    }
    
}