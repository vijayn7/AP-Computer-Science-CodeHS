import java.util.Scanner;
public class TaffyTester
{
    public static void main(String[] args)
    {
       
       // Your code starts here
       System.out.println("Starting Taffy Timer...");
       Scanner scan = new Scanner(System.in);
       int temp = 0;
       while (temp < 270) {
            System.out.print("Enter the temperature: ");
            temp = scan.nextInt();
            if (temp < 270) {
                System.out.println("\nThe mixture isn't ready yet.");
            }
       }
       System.out.println("Your taffy is ready for the next step!");
    }
}