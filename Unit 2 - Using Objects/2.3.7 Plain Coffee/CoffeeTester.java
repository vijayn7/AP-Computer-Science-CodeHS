public class CoffeeTester
{
    public static void main(String[] args)
    {
        // Create Specialized Coffee
        Coffee latte = new Coffee(4, false, "soy");
        System.out.println(latte);
        
        // Create a default coffee
        // This should work after you create the default
        // constructor
        Coffee plain = new Coffee();
        System.out.println(plain);
        
    }
}2.3.7 Plain Coffee