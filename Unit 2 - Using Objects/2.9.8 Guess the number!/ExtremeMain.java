import java.util.Scanner;
import java.lang.*;

public class ExtremeMain
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner scan = new Scanner(System.in);
        
        // Create an Extremes object
        Extremes extremes = new Extremes();
        
        // Ask the user to guess the maximum value of an Integer
        System.out.println("Guess the maximum Integer value:");
        int number = Integer.valueOf(scan.next());
        
        // Compute and display the difference
        // between the max and the guess
        System.out.println("You were off by " + extremes.maxDiff(number));
        
        // Ask the user to guess the minimum value of an Integer
        System.out.println("Guess the minimum Integer value:");
        number = Integer.valueOf(scan.next());

        // Compute and display the difference 
        // between the min and the guess
        System.out.println("You were off by " + extremes.minDiff(number));
        
    }
}