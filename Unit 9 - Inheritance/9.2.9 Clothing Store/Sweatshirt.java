public class Sweatshirt extends Clothing
{
    private boolean hasHood;
    
    public Sweatshirt(String size, String color, boolean hasHood) {
        super(size, color);
        this.hasHood = hasHood;
    }
    
    public boolean hasHood() {
        return hasHood;
    }
}