public class PhonebookTester
{
    public static void main(String[] args)
    {
        Phonebook test = new Phonebook();
        test.addNumber(new PhoneNumber("Sherry", "12312312"));
        test.addNumber(new PhoneNumber("Dylan", "12312312"));
        test.addNumber(new PhoneNumber("Kevin", "12312312"));
        test.addNumber(new PhoneNumber("Bob", "12312312"));
        test.addNumber(new PhoneNumber("Alex", "12312312"));
        test.printPhoneBook();
    }
}