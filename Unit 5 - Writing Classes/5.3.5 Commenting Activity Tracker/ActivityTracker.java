public class ActivityTracker
{
    public static void main(String[] args)
    {
        ActivityLog mylog = new ActivityLog(); // create object
        
        mylog.addMiles(5); // add miles to instance
        mylog.addHours(1); // add hours to instance
        
        System.out.print("Total Miles: ");
        System.out.println(mylog.getMiles()); // print miles
        
        double hoursToday = mylog.getHours(); // save hours
        
        mylog.addHours(1.5); // add hours to running total
        mylog.addHours(3); // add hours to running total
        
        double increase = mylog.getHours() - hoursToday; // find differance of current hours to today's hours
        
        System.out.print("There are ");
        System.out.print(increase);
        System.out.println(" more hours today than two days ago");
    }
}