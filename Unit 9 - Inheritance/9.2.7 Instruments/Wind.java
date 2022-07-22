public class Wind extends Instrument
{
    private boolean usesReed;
    
    public Wind(String name, String family, boolean usesReed) {
        super(name, family);
        this.usesReed = usesReed;
    }
    
    public void setusesReed(boolean usesReed) {
        this.usesReed = usesReed;
    }
    
    public boolean getusesReed() {
        return usesReed;
    }
}