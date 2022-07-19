import java.util.Scanner;

public class Basketball
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // Start by listing the steps you need to take
        System.out.println("Enter player one's name: ");
        String name1 = scan.next();
        System.out.println("Enter player two's name:");
        String name2 = scan.next();
        System.out.println("Enter " + name1 + "'s score");
        int score1 = scan.nextInt();
        System.out.println("Enter " + name2 + "'s score");
        int score2 = scan.nextInt();
        if (name1.compareTo(name2) < 0) {
            System.out.println(name1 + " scored " + score1 + " points");
            System.out.println(name2 + " scored " + score2 + " points");
        } else {
            System.out.println(name2 + " scored " + score2 + " points");
            System.out.println(name1 + " scored " + score1 + " points");
        }
        
        if (score1 > score2) {
        System.out.println(name1 + " wins!");
        } else {
        System.out.println(name2 + " wins!");
        }
        
    }
}