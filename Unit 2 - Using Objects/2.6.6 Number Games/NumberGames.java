public class NumberGames
{
    
    // Keep track of the number
    private double num;
    
    // Constructor
    public NumberGames(double startingNumber)
    {
        num = startingNumber;
    }
    
    // Returns the number
    public double getNumber()
    {
        return num;
    }
    
    // Doubles the number
    // Returns the doubled number
    public double doubleNumber()
    {
        num *= 2;
        return num;
    }
    
    // Squares the number
    // Returns the squared number
    public double squareNumber()
    {
        num *= num;
        return num;
    }
    
    
}
