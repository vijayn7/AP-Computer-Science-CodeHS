import java.util.Scanner;

import org.w3c.dom.Text;

public class WordGameTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for a word
        System.out.println("Enter a word:");
        String word = input.nextLine();
        
        // Scramble it
        // Print out scrambled word
        WordGames w = new WordGames(word);
        System.out.println(w.scramble());
        
        // Ask for an index
        // Ask for random word
        System.out.println("Enter an integer: ");
        int idx = input.nextInt();
        input.nextLine();  // skip over the newline
        System.out.println("Enter another word: ");
        String Text = input.nextLine();
        
        // Add random word at index
        // Print out the word
        System.out.println(w.bananaSplit(idx, Text));
        
        // Ask for a character (store as a String)
        // Ask for random word
        // Add random word at character
        // Print out the word
        System.out.println("Enter an character: ");
        int character = input.nextInt();
        input.nextLine();  // skip over the newline
        System.out.println("Enter another word: ");
        Text = input.nextLine();

        System.out.println(w.bananaSplit(character, Text));

    }
}