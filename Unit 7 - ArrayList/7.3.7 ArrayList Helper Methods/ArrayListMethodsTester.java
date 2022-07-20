import java.util.ArrayList;

public class ArrayListMethodsTester
{
    public static void main(String[] args)
    {
        ArrayList<String> stringArray = new ArrayList<String>();
        stringArray.add("This");
        stringArray.add("is");
        stringArray.add("an");
        stringArray.add("ArrayList");
        stringArray.add("of");
        stringArray.add("Strings");
        
        ArrayListMethods.print(stringArray);
        System.out.println("\nArrayList is condensing:");
        ArrayListMethods.condense(stringArray);
        ArrayListMethods.print(stringArray);
        System.out.println("\nArrayList is duplicating:");
        ArrayListMethods.duplicate(stringArray);
        ArrayListMethods.print(stringArray);
        
    }
}