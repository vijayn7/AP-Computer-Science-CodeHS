public class FormFillTester
{
    public static void main(String[] args)
    {
        FormFill filler = new FormFill("Karel", "Dog");
        filler.setAddress(123, "Cherry Lane", "4B");
        
        System.out.println(filler.fullName());
        System.out.println(filler.streetAddress());
        
        System.out.println(filler.creditCardInfo(123456789, 10, 2025));
        
    }
}