import java.util.Scanner;

public class CastingToDouble
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a integer");
        int int1 = scanner.nextInt();
        System.out.println("Enter a integer");
        int int2 = scanner.nextInt();
        
        double x = (double)int1 / (double)int2;
        
        System.out.println(x);
    }
}