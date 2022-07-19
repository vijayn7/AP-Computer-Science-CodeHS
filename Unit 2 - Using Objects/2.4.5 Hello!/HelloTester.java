import java.util.Scanner;

public class HelloTester
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
    
        Hello good = new Hello("Vijay Nannapuraju");
        
        good.english();
        good.spanish();
        good.french();
    }
}
