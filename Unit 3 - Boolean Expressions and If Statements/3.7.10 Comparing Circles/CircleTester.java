public class CircleTester 
{
    public static void main(String[] args)
    {
        Circle one = new Circle(10, "blue", 50, 35);
        Circle two = new Circle(10, "blue", 50, 35);
        Circle three = new Circle(20, "red", 0, 0);
        Circle four = three;
        
        // Modify this program to correctly compare objects
        // We should not be comparing objects using ==
        
        if(one == two)
        {
            System.out.println("Circles one and two are equal!");
            System.out.println(one);
            System.out.println(two);
        }
        
        if(three == four)
        {
            System.out.println("Circles three and four are equal!");
            System.out.println(three);
            System.out.println(four);
        }
    }
}