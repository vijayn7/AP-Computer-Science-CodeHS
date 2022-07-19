public class Flower
{

    private String name;
    private String color;
    private String genus;
    private String species;

    public Flower(String theName, String theColor, String theGenus, String theSpecies)
    {
        name = theName;
        color = theColor;
        genus = theGenus;
        species = theSpecies;
    }
    
    public String toString()
    {
        return color + " " + name + " " + "(" + genus + " " + species + ")";
    }
}
