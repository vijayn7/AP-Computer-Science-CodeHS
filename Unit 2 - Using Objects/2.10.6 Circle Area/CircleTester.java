public class CircleTester 
{
    public static void main(String[] args)
    {
        Circle cup = new Circle(5);
        System.out.println("Area of a circle with radius 5: " + cup.getArea());   
        System.out.println("Circumference of a circle with radius 5: " + cup.getCircumference());   

        Circle hat = new Circle(12);
        System.out.println("\nArea of a circle with radius 12: " + hat.getArea());   
        System.out.println("Circumference of a circle with radius 12: " + hat.getCircumference());   

    }
}