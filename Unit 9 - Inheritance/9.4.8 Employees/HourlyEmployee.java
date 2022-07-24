public class HourlyEmployee extends Employee
{
    private double hoursPerWeek;
    
    // Call the Employee constructor and pass it a calculated annual salary
    public HourlyEmployee(String name, double hourlySalary, double hoursPerWeek)
    {
        super(name, hourlySalary * hoursPerWeek * 52);
        this.hoursPerWeek = hoursPerWeek;
        
    }
    // Get the annual salary from the superclass and convert it back
    // to hourly.
    public double getHourlySalary()
    {
        return super.getAnnualSalary() / 52 / hoursPerWeek;
    }
    // Use the input to set the annual salary in the superclass
    public void setHourlySalary(double hourlySalary)
    {
        super.setAnnualSalary(hourlySalary * hoursPerWeek * 52);
    }
    /**
     * Example output:
     * Mike makes $18.0 per hour
     */
     
    public String toString()
    {
        return super.getName() + " makes $" + getHourlySalary() + " per hour";
    }
}