import java.util.Scanner;
public class SalutationsTester
{
    public static void main(String[] args)
    {
        // Test your class here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is your name? ");
        String nam = scanner.nextLine();
        
        Salutations Bot = new Salutations(nam);
        
        Bot.addressLetter();
        Bot.signLetter();
        Bot.addressMemo();
        Bot.signMemo();
    }
}
