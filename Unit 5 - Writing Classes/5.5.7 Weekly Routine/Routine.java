public class Routine
{
    private double sleep;
    private double fun;
    private double school;
    private double sports;
    
    public Routine() {
        sleep = 0.0;
        fun = 0.0;
        school = 0.0;
        sports = 0.0;
    }
    
    public void setSleep(double hoursSleep) {
        sleep = hoursSleep;
    }
    
    public void setFun(double hoursFun) {
        fun = hoursFun;
    }
    
    public void setSchool(double hoursSchool) {
        school = hoursSchool;
    }
    
    public void setSports(double hoursSports) {
        sports = hoursSports;
    }
    
    public void printTotal() {
        double total = sleep*7 + school*7 + fun*7 + sports*7;
        double leftOver = 24*7 - total;
        System.out.println("Weekly Totals\nSleep: " + sleep*7 + "\nSchool: " + school*7 + "\nSports: " + sports*7 + "\nFun: " + fun*7 + "\nGrand Total: " + total + "\nHours left over: " + leftOver);
    }
}