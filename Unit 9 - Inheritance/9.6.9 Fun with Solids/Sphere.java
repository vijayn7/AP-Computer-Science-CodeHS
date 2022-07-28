import java.lang.Math;

public class Sphere extends Solid
{
    private double radius;
    
    public Sphere(String name, double radius) {
        super(name);
        this.radius = radius;
    }
 
    @Override
    public double volume()
    {
        return (4.0/3.0) * Math.pow(radius, 3) * Math.PI;
    }
    
    @Override
    public double surfaceArea()
    {
        return 4 * Math.PI * Math.pow(radius, 2);
    }   
    
}