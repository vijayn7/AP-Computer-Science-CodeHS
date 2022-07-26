import java.util.Scanner;

public class StudentTester
{
    public static void main(String[] args)
    {
        // Prompt the user for name, test scores, and service hours
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the student name: ");
        String name = scan.next();
        System.out.println("Please enter the Math Score: ");
        int math = scan.nextInt();
        System.out.println("Please enter the ELA Score: ");
        int ELA = scan.nextInt();
        System.out.println("Please enter the Service Hours: ");
        int cs = scan.nextInt();
        
        // Create a HSStudent object
        HSStudent w = new HSStudent(name, math, ELA, cs);
        // Print the results
        System.out.println("Pass Math? " + w.passMath());
        System.out.println("Pass ELA? " + w.passEla());
        System.out.println("Completed Service Hours? " + w.completeService());
        System.out.println(w);
    }
}