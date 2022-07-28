/* This is the Scratchpad!
This file is not graded, but you can use it to test your code.

You can write and test your method in the Scratchpad, but make
sure to copy and paste it into the Unit Test file before checking
your answer. Remember to only copy and paste the method you want
to submit, not all of your tests.
*/

public class Scratchpad
{
    public static void main(String[] args)
    {
        System.out.println(isLowerCase("heLlo"));
    }

    public static boolean isLowerCase(String phrase)
    {
        for (int i = 0; i < phrase.length(); i++) {
            String character = phrase.substring(i, i + 1);
            String lc = phrase.toLowerCase().substring(i, i + 1);
            if (!character.equals(lc)) {
                return false;
            }
        }
        return true;
    }
}
