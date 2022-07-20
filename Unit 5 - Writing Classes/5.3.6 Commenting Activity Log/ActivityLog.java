public class ActivityLog
{
    private double numHours;
    private double numMiles;
    
    /**
    constructor for activity log. begins with zero miles and hours
    */
    public ActivityLog()
    {
        numHours = 0;
        numMiles = 0;
    }
    
    /**
    add 'hours' hours to the total hours of the instance
    
    @param hours - hours to add
    */
    public void addHours(double hours)
    {
        numHours += hours;
    }
    
    /**
    add 'miles' miles to the total miles of the instance
    
    @param miles - miles to add
    */
    public void addMiles(double miles)
    {
        numMiles += miles;
    }
    
    /**
    getter method that returns the miles logged so far
    
    @return numMiles - number of miles logged so far
    */
    public double getMiles()
    {
        return numMiles;
    }
    
    /**
    getter method that returns the hours logged so far
    
    @return numHours - number of hours logged so far
    */
    public double getHours() 
    {
        return numHours;
    }
    
}