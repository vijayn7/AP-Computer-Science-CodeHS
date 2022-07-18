import java.util.Scanner;

public class Citation
{
    public static void main(String[] args)
    {
        // Start here!
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the author's name as 'Last name, First name':");
        String name = scanner.nextLine();
        System.out.println("Enter the title of the book:");
        String title = scanner.nextLine();
        System.out.println("Enter the publisher of the book:");
        String publisher = scanner.nextLine();
        System.out.println("Enter the year the book was published:");
        String year = scanner.nextLine();
        
        System.out.print(name+ ". " +title);
        System.out.println(".");
        System.out.print(publisher+ "," +year);
        System.out.print(".");
        
    }
}