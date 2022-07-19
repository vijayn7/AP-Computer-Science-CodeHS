public class CurrencyTester
{
    public static void main(String[] args)
    {
        Currency bankRoll = new Currency(12.45);
        
        System.out.println("Value of bankroll: " + bankRoll);
        System.out.println("Dollars: " + bankRoll.getDollars());
        System.out.println("Cents: " + bankRoll.getCents());
        
        
        bankRoll.setValue(20.56);
        System.out.println("Value of bankroll: " + bankRoll);
        System.out.println("Dollars: " + bankRoll.getDollars());
        System.out.println("Cents: " + bankRoll.getCents());
        
        bankRoll.setValue(67.78);
        System.out.println("Value of bankroll: " + bankRoll);
        System.out.println("Dollars: " + bankRoll.getDollars());
        System.out.println("Cents: " + bankRoll.getCents());
        
        
    }
}