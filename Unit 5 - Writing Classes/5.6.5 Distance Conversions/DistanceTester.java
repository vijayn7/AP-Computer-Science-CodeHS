public class DistanceTester
{
    public static void main(String[] args)   
    {
        // Create three Distance objects
        Distance one = new Distance(5.0);
        Distance two = new Distance(10.0);
        Distance three = new Distance(12.0);
        
        // Convert one to yards, one to kilometers,
        // and the last one to feet
        System.out.println(one.toYards());
        System.out.println(two.toKilometers());
        System.out.println(three.toFeet());
        
        // Print out the converted values
    }
}