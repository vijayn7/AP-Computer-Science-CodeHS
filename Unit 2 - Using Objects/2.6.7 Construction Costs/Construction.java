public class Construction
{
    
    private double lumber;  // price per board 
    private double windows; // price per square inch of window
    private double taxRate; 
   
    
    public Construction(double lumberCost, double windowCost, double taxes)
    {
        lumber = lumberCost;
        windows = windowCost;
        taxRate = taxes;
    }
    
    // Computes and returns the cost
    // of the lumber
    public double lumberCost(int numBoards)
    {
        return lumber * numBoards;   
    }
    
    // Computes and returns the cost of the windows
    public double windowCost(int numWindows)
    {
        return windows * numWindows;   
    }
    
    // Computes the grand total by adding
    // the tax amount to the total
    public double grandTotal(double total)
    {
        return total * (1 + taxRate);
    }
    
}
