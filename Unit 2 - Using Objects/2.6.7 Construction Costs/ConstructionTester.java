import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the sales tax rate:");
        double a = scanner.nextDouble();
        System.out.println("How many boards do you need? ");
        int b = scanner.nextInt();
        System.out.println("How many windows do you need? ");
        int c = scanner.nextInt();
        
        Construction n = new Construction(8, 11, a);
        
        double q = n.lumberCost(b);
        double s = n.windowCost(c);
        
        double x = q + s;
        
        System.out.println("Total: " +x);
        
        double g = n.grandTotal(x);
        
        System.out.println("Grand Total: " +g);
    }
}