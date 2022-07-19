import java.util.Scanner;

public class BotTester
{
    public static void main(String[] args) {

        //Put your code here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hello. What is your name? ");
        String name = scanner.nextLine();
        
        Bot h = new Bot(name);
        h.greeting();
        h.help();
        
        System.out.println("What's the weather like?");
        
        h.weather();
        
        System.out.println("How many feet in a mile?");
        
        h.feetInMile();
        h.goodbye();
    }
}