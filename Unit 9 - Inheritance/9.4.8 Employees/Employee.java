public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double annualSalary){
       this.name = name;
       this.salary = annualSalary;
    }

    public String getName(){
        return name;
    }

    public double getAnnualSalary(){
        return salary;
    }

    public void setAnnualSalary(double annualSalary){
        salary = annualSalary;
    }

    /**
     * Example output:
     * Mr. Karel makes $75000.0 per year
     */
     
    public String toString(){
        return name + " makes $" + getAnnualSalary() + " per year";
    }
}