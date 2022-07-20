import java.util.Scanner;
public class Letter
{
    public static void main(String[] args)
    {
        // Ask the user for 3 things: their word, letter they want to replace,
        // and replacing letter.
        
        // Call the method replaceLetter and pass all 3 of these items to it for 
        // string processing.
        
        Scanner scan = new Scanner(System.in);
        String word;
        String l1;
        String l2;
        System.out.println("Enter your word:");
        word = scan.next();
        System.out.println("\nEnter the letter you want to replace:");
        l1 = scan.next();
        System.out.println("\nEnter the replacing letter:");
        l2 = scan.next();
        System.out.println(replaceLetter(word, l1, l2));
    }
    
    // Modify this method so that it will take a third parameter from a user that is the String they want to
    //to replace letterToReplace with. This method should return the modified String.
    public static String replaceLetter(String word, String letterToReplace, String letterToReplaceWith)
    {
        String wordnew = "";
        
        for(int i = 0; i < word.length(); i++)
        {
            if(word.substring(i, i+1).equals(letterToReplace))
            {
                wordnew += letterToReplaceWith;
            } else {
                wordnew += word.substring(i, i+1);
            }
        }
        return wordnew;
    }
}