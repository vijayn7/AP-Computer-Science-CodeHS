import java.util.Scanner;

public class CastingToInt
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a double variable");
        double myDouble = scanner.nextDouble();
        
        int x = (int)myDouble;
        
        System.out.print(x);
    }
}