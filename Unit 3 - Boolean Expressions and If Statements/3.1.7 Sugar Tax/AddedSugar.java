import java.util.Scanner;

public class AddedSugar
{
    public static void main(String[] args)
    {
        // Ask the user for the grams of sugar
        System.out.println("How many grams of sugar have you eaten today? ");
        Scanner scan = new Scanner(System.in);
        int grams = Integer.valueOf(scan.next());
        boolean can = grams < 30;
        
        // Use a boolean expression to print if they can eat more sugar
        System.out.println("You can eat more sugar: " + can);
    }
}