public class Calculator
{
    // This class does not need instance variables!
    // Since there are no instance variables,
    // this class also does not need a constructor.
    
    // Java will create an empty constructor for you.
    
    // Returns the sum of x and y
    public double sum(double x, double y)
    {
        return x + y;
        
    }
    
    // Returns the product of x and y
    public double multiply(double x, double y)
    {
        return x * y;
        
    }
    
    // Returns the quotient x / y
    public double divide(double x, double y)
    {
       return x / y;
    }
    
    // Returns the difference of x - y
    public double subtract(double x, double y)
    {
        return x - y;
    }
    
}
