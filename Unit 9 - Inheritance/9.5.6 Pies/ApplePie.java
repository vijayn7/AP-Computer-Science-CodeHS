public class ApplePie extends Pie {

    public ApplePie (int slices) 
    {
        super("Apple", slices);
    }
    
    public boolean hasSlice()
    {
        return super.getSlices() > 0;
    }
    
    @Override
    public void eatSlice()
    {
        if (this.hasSlice())
        {
        	super.eatSlice();
        }
    }
}