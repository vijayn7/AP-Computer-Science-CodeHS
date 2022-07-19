public class UnitCircle 
{
    
    public static double getCos(double angle) {
        return Math.round((Math.cos(angle) * 100)) / 100;
    }
    
    public static double getSin(double angle) {
        return Math.round((Math.sin(angle) * 100)) / 100;
    }
    
    public static void main(String[] args)
    {
        System.out.println("Radians: (cos, sin)");
        System.out.println(0.0 + ": " + getCos(0.0) + ", " + getSin(0.0));
        System.out.println(Math.PI/2 + ": " + getCos(Math.PI/2) + ", " + getSin(Math.PI/2));
        System.out.println(Math.PI + ": " + getCos(Math.PI) + ", " + getSin(Math.PI));
        // Put your code here!
    }
}