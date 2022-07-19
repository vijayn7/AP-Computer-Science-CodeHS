import java.util.Scanner;

public class DrinkOrder
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Start here!
        // You'll find it helpful to list the steps you
        // need to take, then write the code
        
        System.out.println("What do you want to drink?");
        String drink = input.nextLine();
        System.out.println("How many teaspoons of sugar do you want? ");
        int sugar = input.nextInt();
        if (sugar > 0) {
            drink +=" with sugar";
        }
        System.out.println("\nConfirming your order. You wanted: ");
        System.out.println(drink);
    }
}