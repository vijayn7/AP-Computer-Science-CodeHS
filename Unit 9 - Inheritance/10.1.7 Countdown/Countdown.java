import java.util.Scanner;

public class Countdown
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter a number to start: ");
       int number = sc.nextInt();
       System.out.println(countdown(number));
       
    }
    
    public static String countdown(int number)
    {
       
       if(number == 0) {
           return "Blastoff!";
       }
       
       return number + " " + countdown(number - 1);
       
    }
}