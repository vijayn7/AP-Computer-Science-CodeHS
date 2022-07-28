public class Solid
{
    private String myName;

    public Solid(String name)
    {
        myName = name;
    }

    public String getName()
    {
        return myName;
    }

    // This should be overriden in the subclass
    public double volume()
    {
        return 0;
    }
    
    // This should be overriden in the subclass
    public double surfaceArea()
    {
        return 0;
    }
}