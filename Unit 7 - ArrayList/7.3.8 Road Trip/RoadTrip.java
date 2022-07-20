import java.util.ArrayList;

public class RoadTrip
{
    private static ArrayList<GeoLocation> roadTrip = new ArrayList<GeoLocation>();
    
    // Create a GeoLocation and add it to the road trip
    public void addStop(String name, double latitude, double longitude) {
        GeoLocation geoLocation = new GeoLocation(name, latitude, longitude);
        roadTrip.add(geoLocation);
    }
    
    // Get the total number of stops in the trip
    public int getNumberOfStops() {
        return roadTrip.size();
    }
    
    // Get the total miles of the trip
    public double getTripLength() {
        double sum = 0;
        for (int i = 0; i < roadTrip.size() - 1; i++) {
            sum += roadTrip.get(i).distanceFrom(roadTrip.get(i + 1));
        }
        return sum;
    }
    
    // Return a formatted toString of the trip
    public String toString() {
        String temp = "";
        for (int i = 0; i < roadTrip.size(); i++) {
            temp += "\n" + (i + 1) + ". " + roadTrip.get(i).toString(); 
        }
        return temp;
    }
}