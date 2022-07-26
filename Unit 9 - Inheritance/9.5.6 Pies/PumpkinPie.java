public class PumpkinPie extends Pie {
    
    private boolean canned;

    public PumpkinPie (int slices, boolean canned) 
    {
        super("Pumpkin", slices);
        this.canned = canned;
    }
    
    public boolean canned()
    {
        return canned;
    }
    
}