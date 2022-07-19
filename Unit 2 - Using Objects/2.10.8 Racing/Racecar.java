public class Racecar
{
    private double accel; // acceleration
    private String name; // name of driver
    
    public Racecar(double acceleration, String driver)
    {
        accel = acceleration;
        name = driver;
    }
    
    // Returns the time it takes the racecar
    // to complete the track
    public double computeTime(double distance)
    {
        double t = 2*distance/accel;
        t = Math.sqrt(t);
        t *= 100;
        t = Math.round(t);
        t = t/100;
        return t;
    }
    
    public String toString()
    {
        return "Racer " + name;
    }
}