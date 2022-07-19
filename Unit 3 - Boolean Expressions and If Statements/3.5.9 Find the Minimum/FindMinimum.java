import java.util.Scanner;

public class FindMinimum 
{
    public static int min(int num1, int num2) {
        if (num1 > num2) {
            return num2;
        }
        return num1;
    }
    
    public static void main(String[] args)
    {
        // Ask the user for three ints and 
        // print out the minimum.
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the first integer: ");
        int one = scan.nextInt();
        System.out.println("Enter the second integer: ");
        int two = scan.nextInt();
        System.out.println("Enter the third integer: ");
        int three = scan.nextInt();
        System.out.println("The minimum is " + min(three, min(two, one)));
    }
}