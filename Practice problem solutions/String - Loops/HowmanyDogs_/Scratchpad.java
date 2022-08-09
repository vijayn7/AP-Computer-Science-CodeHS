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
        System.out.println(countDog("dogdogdog"));
    }

    public static int countDog(String phrase)
{
    int count = 0;
    for (int i = 0; i < phrase.length() - 2; i++) {
        System.out.println(phrase.substring(i, i + 3));
        if (phrase.substring(i, i + 3).equals("dog")) {
            count++;
        }
    }
    return count;
}
}
