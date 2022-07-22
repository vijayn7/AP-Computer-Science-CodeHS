public class Strings extends Instrument
{
    private boolean usesBow;
    
    public Strings(String name, boolean usesBow) {
        super(name, "Strings");
        this.usesBow = usesBow;
    }
    
    public void setUsesBow(boolean usesBow) {
        this.usesBow = usesBow;
    }
    
    public boolean getUsesBow() {
        return usesBow;
    }
}