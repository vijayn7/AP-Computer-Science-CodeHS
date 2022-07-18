import java.util.Scanner;

public class MovieRatings
{
    public static void main(String[] args)
    {
        // Start here!
       
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Enter movie rating (as a decimal)");
       double rating = scanner.nextDouble();
       
       double r = rating + 0.5;
       int x = (int)r;
       
       System.out.println(x);
    }
}