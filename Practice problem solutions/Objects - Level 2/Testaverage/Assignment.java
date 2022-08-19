public class Assignment
{
    private String type;
    private int earned;
    private int available;
    
    public Assignment(String type, int earned, int available)
    {
        this.type = type;
        this.earned = earned;
        this.available = available;
    }
    
    public String getType()
    {
        return type;
    }
    
    public int getAvailable()
    {
        return available;
    }
    
    public int getEarned()
    {
        return earned;
    }
}
