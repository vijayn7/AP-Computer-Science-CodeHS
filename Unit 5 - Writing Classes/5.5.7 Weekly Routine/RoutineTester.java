public class RoutineTester
{
    public static void main(String[] args) 
    {
        Routine myWeek = new Routine();
        
        myWeek.setSchool(8);
        myWeek.setSports(3);
        myWeek.setSleep(8);
        myWeek.setFun(2);
        
        // Prints the totals for the WHOLE WEEK
        myWeek.printTotal();
    }
}