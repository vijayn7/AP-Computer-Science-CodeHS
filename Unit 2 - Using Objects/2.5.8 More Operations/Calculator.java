public class Calculator
{
    // This class does not need instance variables!
    
    // Prints the sum of x and y
    public void sum(double x, double y)
    {
        double result = x + y;
        System.out.print(x);
        System.out.print(" + ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(result);
        
    }
    
    // Prints the product of x and y
    public void multiply(double x, double y)
    {
        double result = x * y;
        System.out.print(x);
        System.out.print(" * ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(result);
        
    }
    
    // Prints the product of x and y
    public void divide(double x, double y)
    {
        double result = x / y;
        System.out.print(x);
        System.out.print(" / ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(result);
        
    }
    
    // Prints the product of x and y
    public void subtract(double x, double y)
    {
        double result = x - y;
        System.out.print(x);
        System.out.print(" - ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(result);
        
    }
}