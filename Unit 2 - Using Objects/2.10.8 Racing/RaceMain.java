public class RaceMain
{
    public static void main(String[] args)
    {
        // Length of the course in meters
        double distance = 2414; // ~ 1.5 miles
        
        // Generate a random acceleration for each car
        double accel1 = .016540;
        double accel2 = 1;
        
        // Create two Racecar objects
        Racecar first = new Racecar(accel1, "first");
        Racecar second = new Racecar(accel2, "second");
        
        // Compute the finishing times for both cars
        
        // Print times of each car
        System.out.println("First car finished in " + first.computeTime(distance) + " seconds");
        System.out.println("Second car finished in " + second.computeTime(distance) + " seconds");
    }
}