/*
* This class represents a cup of coffee
* 
*/
public class Coffee
{
    // Instance Variables
    private int brewStrength; // on a scale of 1 to 5, 5 being the darkest
    private boolean sugar;    // has sugar (true) or does not (false)
    
    // takes the values "none", "whole", "nonfat", "soy", or "almond"
    private String milkType; 
    
    // Add a default constructor (no parameters)
    // to initialize the instance variables
    // to a default cup of coffee
    public Coffee()
    {
        brewStrength = 3;
        sugar = true;
        milkType = "whole";
    }
    
    // Specialized constructor
    public Coffee(int howStrong, boolean hasSugar, String milk)
    {
        brewStrength = howStrong;
        sugar = hasSugar;
        milkType = milk;
    }
    
    
    // String representation to print
    // Do not modify this function
    public String toString()
    {
        return "Coffee brewed to level " + brewStrength + " with " + milkType + " milk. Sugar? " + sugar;
    }
    
}