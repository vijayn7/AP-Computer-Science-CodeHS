import java.util.*;

public class NightOut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Start here!
        
        System.out.println("How much did dinner cost?");
        double dinner = input.nextDouble();
        
        System.out.println("How much is mini-golf for one person?");
        double mini = input.nextDouble();
        
        System.out.println("How much did dessert cost?");
        double dessert = input.nextDouble();
        
        System.out.print("Dinner: $");
        System.out.println(dinner);
        
        System.out.print("Mini-Golf: $");
        System.out.println(mini);
        
        System.out.print("Dessert: $");
        System.out.println(dessert);
        
        mini = mini * 2;
        
        double x = dinner + mini + dessert;
        
        System.out.print("Grand Total: $");
        System.out.println(x);
        
    }
}