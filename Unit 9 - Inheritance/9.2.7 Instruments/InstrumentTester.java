public class InstrumentTester
{
    public static void main(String[] args)
    {
        /**
         * Don't Change This Tester Class!
         * 
         * When you are finished, this should run without error.
         */ 
        Wind tuba = new Wind("Tuba", "Brass", false);
        Wind clarinet = new Wind("Clarinet", "Woodwind", true);
        
        Strings violin = new Strings("Violin", true);
        Strings harp = new Strings("Harp", false);
        
        System.out.println(tuba);
        System.out.println(clarinet);
        
        System.out.println(violin);
        System.out.println(harp);
    }
}