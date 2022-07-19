public class PinataTester
{
    public static void main(String[] args)
    {
        // Make Pinatas!
        Pinata ella = new Pinata();
        Pinata pete = new Pinata("chocolate", "blue", "star");
        Pinata sweetie = new Pinata("sour straws");
        
        // Print the pinatas
        System.out.println(ella);
        System.out.println(pete);
        System.out.println(sweetie);
        
        
    }
}