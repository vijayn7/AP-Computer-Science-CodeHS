public class Assignment
{
    private String name;
    private double availablePoints;
    private double earnedPoints;
    
    public Assignment(String name, double availablePoints, double earnedPoints) {
        this.name = name;
        this.availablePoints = availablePoints;
        this.earnedPoints = earnedPoints;
    }
    
    public void setName(String name) {
    this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAvailablePoints(double availablePoints) {
        this.availablePoints = availablePoints;
    }
    
    public double getAvailablePoints() {
        return availablePoints;
    }
    
    public void setEarnedPoints(double earnedPoints) {
        this.earnedPoints = earnedPoints;
    }
    
    public double getEarnedPoints() {
        return earnedPoints;
    }
}