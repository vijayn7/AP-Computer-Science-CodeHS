import java.lang.Math;

public class Pyramid extends Solid
{
    private double length;
    private double width;
    private double height;
    
    public Pyramid(String name, double length, double width, double height) {
        super(name);
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double volume()
    {
        return (length * width * height) / 3;
    }
    
    @Override
    public double surfaceArea()
    {
        double baseArea = (length * width);
        
        double slantHeightFront = Math.sqrt(Math.pow(height, 2) + Math.pow(length / 2, 2));
        double slantHeightSide = Math.sqrt(Math.pow(height, 2) + Math.pow(width / 2, 2));
        
        double frontArea = width * slantHeightFront * 0.5;
        double sideArea = length * slantHeightSide * 0.5;
        
        return baseArea + frontArea * 2 + sideArea * 2;
    }   
}