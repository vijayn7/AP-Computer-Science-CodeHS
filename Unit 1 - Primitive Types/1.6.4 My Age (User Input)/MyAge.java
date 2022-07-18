import java.util.Scanner;
//Refer to your code from the previous My Age exercise. 
// Modify it using the Scanner class to take user input instead of hard coding in your age. 

public class MyAge
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Start here!
        
        int age;
        
        System.out.println("What is your age? ");
        age = input.nextInt();
        
        System.out.print("My current age is: ");
        System.out.println(age);
        age++;
        System.out.print("My age next year will be: ");
        System.out.println(age);
        age--;
        System.out.print("My current age is: ");
        System.out.println(age);
    }
}