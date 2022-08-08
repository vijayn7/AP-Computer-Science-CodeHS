/* This is the Scratchpad!
This file is not graded, but you can use it to test your code.

You can write and test your method in the Scratchpad, but make
sure to copy and paste it into the Unit Test file before checking
your answer. Remember to only copy and paste the method you want
to submit, not all of your tests.
*/
import java.util.ArrayList;
public class Scratchpad
{
    public static void main(String[] args)
    {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        System.out.println(arr);
        System.out.println(repeatArrayList(arr, 3));
    }

    public static ArrayList<String> repeatArrayList(ArrayList<String> list, int numRepeats)
{
    ArrayList<String> arr = new ArrayList<String>();
    
    for (int i = 0; i < numRepeats; i++) {
        for (int j = 0; j < list.size(); j++) {
            arr.add(list.get(j));
        }
    }
    return arr;
}
}
