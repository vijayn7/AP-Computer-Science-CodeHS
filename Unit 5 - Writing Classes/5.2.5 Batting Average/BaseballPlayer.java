public class BaseballPlayer
{
    private int hits;
    private int atBats;
    private String name;
    
    //Add constructor here
    public BaseballPlayer(String name, int hits, int atBats)
    {
        this.name = name;
        this.hits = hits;
        this.atBats = atBats;
    } 
    
    public void printBattingAverage()
    {
        double battingAverage = hits / (double) atBats;
        System.out.println(battingAverage);
    }
    
    public String toString()
    {
        return name + ": " + hits + "/" + atBats;
    }
    
    
}