import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Put your code here
        // A good place to start is to
        // create comments to remind yourself 
        // what you need to do
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two doubles");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        
        Calculator calc = new Calculator();
        
        System.out.println(a + " + " + b + " = " + calc.sum(a, b));
        System.out.println(a + " - " + b + " = " + calc.subtract(a, b));
        System.out.println(a + " * " + b + " = " + calc.multiply(a, b));
        System.out.println(a + " / " + b + " = " + calc.divide(a, b));
        
    }
}