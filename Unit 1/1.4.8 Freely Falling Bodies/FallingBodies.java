public class FallingBodies
{
    public static void main(String[] args)
    {
        double g = 9.8;
        double t = 10;
        double x = t * t;
        double h = 0.5 * g * x;
        double v= g * t;

        System.out.println("The height is " +h);
        System.out.println("The velocity of the object is " +v);
    }
}