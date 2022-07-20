import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        // Your code goes here!
        // It is useful to plan out your steps before you get started!
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int largest = 0;
        int smallest = 0;
        
        while (true) {
            System.out.println("Enter a number (-1 to quit):");
            num = scan.nextInt();
            if (num == -1) {
                break;
            }
            if (largest == 0) {
                largest = num;
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
            System.out.println("Smallest # so far: " + smallest);
            System.out.println("Largest # so far: " + largest);
        }
    }
}