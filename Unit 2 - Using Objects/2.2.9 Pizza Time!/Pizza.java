public class Pizza
{
    // Add the instance variables here
    private String type;
    private String toppings;
    private int size;
    // Put the constructor here
    Pizza(String theType, String theToppings, int theSize)
    {
        type = theType;
        toppings = theToppings;
        size = theSize;
    }
    
    
    
    // You don't need to do anything with this method
    // Used to print the object
    public String toString()
    {
        return size + " inch " + type + " pizza with " + toppings;
    }
}
