import java.util.Scanner;

public class RollerCoaster 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        int age = scan.nextInt();
        
        if (height >= 42 && age >= 9) {
            System.out.println("Welcome aboard!");
        } else {
            System.out.println("Sorry, you are not eligible to ride");
        }
    }
}