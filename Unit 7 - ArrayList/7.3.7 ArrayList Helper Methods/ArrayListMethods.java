import java.util.ArrayList;
public class ArrayListMethods
{
    public static void print(ArrayList<String> arr) {
        for (String each : arr) {
            System.out.println(each);
        }
    }
    
    public static void condense(ArrayList<String> arr) {
        ArrayList<String> temp = new ArrayList<String>();
        for (int i = 0; i < arr.size(); i+=2) {
            if (i < arr.size() - 1) {
                temp.add(arr.get(i) + arr.get(i+1));
            } else {
                temp.add(arr.get(i));
            }
        }
        
        arr.clear();
        
        for (String string : temp) {
            arr.add(string);
        }
    }
    
    public static void duplicate(ArrayList<String> arr) {
        ArrayList<String> temp = new ArrayList<String>();
        for (String string : arr) {
            temp.add(string);
            temp.add(string);
        }
        
        arr.clear();
        
        for (String string : temp) {
            arr.add(string);
        }
    }
    
}