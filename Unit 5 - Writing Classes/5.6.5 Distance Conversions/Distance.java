public class Distance
{
    private double miles;
    
    public Distance(double startMiles) {
        miles = startMiles;
    }
    
    public double toKilometers() {
        return miles / 0.62137;
    }
    
    public double toFeet() {
        return miles * 5280;
    }
    
    public double toYards() {
        return miles * 1760;
    }
    
    public double getMiles() {
        return miles;
    }
}