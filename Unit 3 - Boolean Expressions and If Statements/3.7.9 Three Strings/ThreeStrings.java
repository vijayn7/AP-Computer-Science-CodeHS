import java.util.Scanner;
public class ThreeStrings
{
    public static void main(String[] args)
    {
        // Ask the user for three strings.
        // Use a Boolean variable to test the comparison of 
        // first+second equals third
        // Remember since you are working with strings to 
        // use equals() and NOT == !
        Scanner scan = new Scanner(System.in);
        System.out.print("First string? ");
        String first = scan.next();
        System.out.print("Second string? ");
        String second = scan.next();
        System.out.print("Third string? ");
        String third = scan.next();
        String together = first + second;
        boolean equal = together.equals(third);
        if (equal) {
            System.out.println(first + " + " + second + " is equal to " + third + "!");
        } else {
            System.out.println(first + " + " + second + " is not equal to " + third + "!");
        }
    }
}