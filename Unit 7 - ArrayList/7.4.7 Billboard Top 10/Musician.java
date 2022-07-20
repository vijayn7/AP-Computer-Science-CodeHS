public class Musician
{
    private String name;
    private int weeksInTop40;
    private int albumsSold;
    private boolean isPlatinum;;
    
    public Musician(String name, int weeksInTop40, int albumsSold)
    {
        this.name = name;
        this.weeksInTop40 = weeksInTop40;
        this.albumsSold = albumsSold;
        setPlatinum(albumsSold);
    }
    
    public void setPlatinum(int albumsSold)
    {
        if(albumsSold >= 1000000)
        {
            isPlatinum = true;
        }
        else
        {
            isPlatinum = false;
        }
    }
    
    public int getWeeksInTop40()
    {
        return this.weeksInTop40;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public boolean getIsPlatinum()
    {
        return isPlatinum;
    }
    
    public String toString()
    {
        return this.name;
    }
}