public class Point
{
    private int x;
    private int y;
    
    public Point(int xCoord, int yCoord)
    {
        x = xCoord;
        y = yCoord;
    }
    
    public void move(int dx, int dy)
    {
        x += dx;
        y += dy;
    }
    
    public String toString()
    {
        return x + ", " + y;
    }
}
