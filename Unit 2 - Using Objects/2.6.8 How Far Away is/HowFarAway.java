import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        // your code here.
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the latitude of the starting location: ");
        double lat1 = scanner.nextDouble();
        System.out.println("Enter the longitude of the starting location: ");
        double long1 = scanner.nextDouble();
        System.out.println("Enter the latitude of the ending location: ");
        double lat2 = scanner.nextDouble();
        System.out.println("Enter the longitude of the ending location: ");
        double long2 = scanner.nextDouble();
        GeoLocation one = new GeoLocation(lat1, long1);
        GeoLocation two = new GeoLocation(lat2, long2);
        System.out.println("The distance is " + one.distanceFrom(two) + " miles.");

    }
}