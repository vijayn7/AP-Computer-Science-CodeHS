import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Calculator calc = new Calculator();
        
        System.out.println("Enter a number with a decimal");
        double x = input.nextDouble();
        
        System.out.println("Enter another number with a decimal");
        double y = input.nextDouble();
        
        calc.sum(x, y);
        calc.subtract(x, y);
        calc.multiply(x, y);
        calc.divide(x, y);
    }
}