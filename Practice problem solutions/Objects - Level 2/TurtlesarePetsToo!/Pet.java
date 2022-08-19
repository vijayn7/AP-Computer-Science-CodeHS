public class Pet
{
    private String species;
    private String name;
    
    public Pet(String species, String name)
    {
        this.species = species;
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    public String getSpecies(){
        return species;
    }
}
