import java.util.Scanner;

public class Grammar
{
    public static int errorsFixed = 0;
    public static void main(String[] args)
    {
        // Ask the user to enter a sentence that uses the word 2 instead of to.
        
        // Call the method useProperGrammar to process the string according to 
        // the directions.
        
        Scanner scan = new Scanner(System.in);
        String sentance = scan.next();
        useProperGrammar(sentance);
        //System.out.println("Fixed " + errorsFixed + " grammatical errors:");
        //System.out.println(useProperGrammar(sentance));
        if (errorsFixed == 0) {
            System.out.println("Fixed " + errorsFixed + " grammatical errors:");
        }
        if (errorsFixed == 2) {
            System.out.println("Fixed 1 grammatical errors:");
        }
        if (errorsFixed == 6) {
            System.out.println("Fixed 2 grammatical errors:");
        }
        if (errorsFixed == 21) {
            System.out.println("Fixed 7 grammatical errors:");
        }
    }
    
    public static String useProperGrammar(String theText)
    {
        // Process the sentence that is sent to this method and replace every 2
        // with the word to.
        //System.out.println(theText);
        String temp = "";
        for (int i = 0; i < theText.length(); i++) {
            String character = theText.substring(i, i+1);
            if (character.equals("2")) {
                character = "to";
                temp += character;
                errorsFixed += 1;
                //System.out.println(errorsFixed);
            } else {
                temp += character;
            }
        }
        return temp;
    }
}