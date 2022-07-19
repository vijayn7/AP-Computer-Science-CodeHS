public class Circle
{
    private double radius;
    
    public Circle(double theRadius)
    {
        radius = theRadius;
    }

    // Implement getArea using
    // Math.PI and
    // Math.pow
    // Area = pi * r^2
    public double getArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }
    
    // Implement getCircumference using
    // Math.PI
    // Circumference = 2 * PI * r
    public double getCircumference()
    {
        return Math.PI * 2 * radius;
    }
    
}