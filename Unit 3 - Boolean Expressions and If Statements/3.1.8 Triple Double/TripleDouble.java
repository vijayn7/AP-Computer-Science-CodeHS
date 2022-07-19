import java.util.Scanner;
public class TripleDouble 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for the three stats
        System.out.println("How many points did you score? ");
        int points = Integer.valueOf(input.next());
        System.out.println("How many rebounds did you get? ");
        int rebounds = Integer.valueOf(input.next());
        System.out.println("How many assists did you have? ");
        int assists = Integer.valueOf(input.next());
        
        // Create three boolean variables that
        // check if the stats are 10 or more
        boolean a = points >= 10;
        boolean b = rebounds >= 10;
        boolean c = assists >= 10;
        
        // Print out the value of each boolean
        // variable.  Be sure to label them!
        System.out.println("You got 10 or more points: " + a);
        System.out.println("You got 10 or more rebounds: " + b);
        System.out.println("You got 10 or more assists: " + c);
        
    }
}