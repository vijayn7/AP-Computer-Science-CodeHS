public class Test extends Assignment {
    
    private String testDate;
    
    public Test(String name, double availablePoints, double earnedPoints, String testDate) {
        super(name, availablePoints, earnedPoints);
        this.testDate = testDate;
    }
    
    public String getTestDate() {
        return testDate;
    }
    
    public void setTestdate(String testDate) {
        this.testDate = testDate;
    }
}