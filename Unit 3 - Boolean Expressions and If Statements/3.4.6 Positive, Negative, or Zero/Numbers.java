import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num == 0) {
            System.out.println("The number is neither positive nor negative!");
        } else if(num < 0) {
            System.out.println("The number is negative!");
        } else {
            System.out.println("The number is positive!");
        }
    }
}