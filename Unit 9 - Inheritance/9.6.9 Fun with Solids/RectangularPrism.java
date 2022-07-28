public class RectangularPrism extends Solid
{
    private double length;
    private double width;
    private double height;
    
    public RectangularPrism(String name, double length, double width, double height) {
        super(name);
        this.length = length;
        this.width = width;
        this.height = height;
    }
 
    @Override
    public double volume()
    {
        return length * width * height;
    }
    
    @Override
    public double surfaceArea()
    {
        return 2*(length * width) + 2*(length * height) + 2*(height * width);
    }   
}