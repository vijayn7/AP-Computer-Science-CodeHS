import java.util.Scanner;

public class FoodRunner
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Food h = new Food("Hamburgers", 600);
        Food f = new Food("French Fries", 350);
        Food c = new Food("Coke", 200);
        
        System.out.println(h);
        System.out.println("How many would you like?");
        int one = scan.nextInt();
        System.out.println(f);
        System.out.println("How many would you like?");
        int two = scan.nextInt();
        System.out.println(c);
        System.out.println("How many would you like?");
        int three = scan.nextInt();
        
        one *= h.getCalories();
        two *= f.getCalories();
        three *= c.getCalories();
        int fo = one + two + three;
        
        System.out.println("Your meal will have a total of " + fo + " calories");
    }
}