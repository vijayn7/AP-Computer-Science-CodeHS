import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {

       //Start Here!
       Scanner scanner = new Scanner(System.in);
       System.out.println("What is your name? ");
       String name = scanner.nextLine();
       Bot2 g = new Bot2(name);
       g.greeting();
       System.out.println("What is your favorite animal? ");
       String mal = scanner.nextLine();
       g.favoriteAnimal(mal);
       System.out.println("Where do you live? ");
       String lo = scanner.nextLine();
       g.home(lo);
       System.out.println("what is your favorite number? ");
       int ae = scanner.nextInt();
       g.favoriteNumber(ae);
       g.goodbye();
    }
}