public class RectangleTester
{
    public static void main(String[] args)
    {
        Rectangle rect1 = new Rectangle(5, 4);
        Rectangle rect2 = new Rectangle(5, 4);
        Rectangle rect3 = new Rectangle(10, 4);
        
        // Print all three rectangles
        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect3);        
        // Print one true statement comparing rectangles
        System.out.println(rect1.equals(rect2));
        // Print one false statment comparing rectangles
        System.out.println(rect1.equals(rect3));
    }
}