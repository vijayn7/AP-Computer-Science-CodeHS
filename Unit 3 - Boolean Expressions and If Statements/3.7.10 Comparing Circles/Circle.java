public class Circle
{
    private int radius;
    private String color;
    private int x;
    private int y;
    
    public Circle(int theRadius, String theColor, int xPosition, int yPosition)
    {
        radius = theRadius;
        color = theColor;
        x = xPosition;
        y = yPosition;
    }
    
    public int getRadius()
    {
        return radius;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public String getColor()
    {
        return color;
    }
    
    // Implement a toString method and an equals method here!
    public String toString()
    {
        // Change this!
        return getColor() + " circle with a radius of " + getRadius() + " at position (" + getX() + ", " + getY() + ")";
    }
    
    public boolean equals(Circle other)
    {
        boolean sameRadius = radius == other.getRadius();
        boolean sameColor = color.equals(other.getColor());
        boolean sameX = x == other.getX();
        boolean sameY = y == other.getY();
        
        if (sameRadius && sameColor) {
            if (sameX && sameY) {
                return true;
            }
        }
        // Change this!
        return false;
    }
}