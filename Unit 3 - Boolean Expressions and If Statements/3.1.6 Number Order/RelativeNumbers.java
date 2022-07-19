import java.util.Scanner;

public class RelativeNumbers
{
    public static void main(String[] args)
    {
        // Ask for two numbers
        Scanner scan = new Scanner(System.in);
        int int1 = Integer.valueOf(scan.next());
        int int2 = Integer.valueOf(scan.next());
        // Compare the numbers as instructed
        boolean one = int1 < int2;
        boolean two = int1 == int2;
        boolean three = int1 > int2;
        // Display the results
        System.out.println("Enter two numbers: ");
        System.out.println(int1 + " < " + int2 + ": " + one );
        System.out.println(int1 + " == " + int2 + ": "  + two);
        System.out.println(int1 + " > " + int2 + ": " + three);
    }
}