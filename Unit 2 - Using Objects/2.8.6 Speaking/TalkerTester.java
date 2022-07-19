import java.util.Scanner;

public class TalkerTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter some text: ");
        String words = input.nextLine();
        
        
        Talker talky = new Talker(words); 
        String yelling = talky.yell();
        String whispers = talky.whisper();
        
        System.out.println(talky);
        System.out.println("Yelling: " + yelling);
        System.out.println("Whispering: " + whispers);
        
    }
}
