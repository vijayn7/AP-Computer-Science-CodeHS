import java.util.ArrayList;

public class Phonebook
{
    private ArrayList<PhoneNumber> numbers = new ArrayList<PhoneNumber>();
    
    public void addNumber(PhoneNumber number) {
        numbers.add(number);
        sort();
    }
    
     private void sort() {
         int n = numbers.size();
        for (int i = 1; i < n; ++i) 
        {
            String key = numbers.get(i).getName();
            PhoneNumber key2 = numbers.get(i);
            int j = i - 1;

            while (j >= 0 && numbers.get(j).getName().compareTo(key) > 0) 
            {
                numbers.set(j + 1, numbers.get(j));
                j -= 1;
            }
            
            numbers.set(j + 1, key2);
        }
    }
    
    public void printPhoneBook() {
        for (PhoneNumber number : numbers) {
            System.out.println(number.getName());
        }
    }
}