import java.util.Scanner;

public class Divisibility 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the dividend: ");
        int dividend = scan.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = scan.nextInt();
        
        if (divisor == 0) {
            System.out.println(dividend + " is not divisible by 0!");
        } else {
            boolean divisible = (dividend % divisor == 0);
            if (divisible) {
                System.out.println(dividend + " is divisible by " + divisor + "!");
            } else {
                System.out.println(dividend + " is not divisible by " + divisor + "!");
            }
        }
        
    }
}