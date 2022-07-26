import java.util.Scanner;

public class PersonTester
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the Person's name:  ");
        String name = scan.next();
        System.out.print("Please enter the Person's birthday:");
        String birthday = scan.next();
        Person one = new Person(name, birthday);
        System.out.print("Please enter the Person's name:  ");
        name = scan.next();
        System.out.print("Please enter the Person's birthday:");
        birthday = scan.next();
        System.out.print("Please enter the Student's grade: ");
        int grade = scan.nextInt();
        Person two = new Student(name, birthday, grade);
        System.out.println(one.equals(two));
    }
}