public class BattleshipTester
{
    public static void main(String[] args)
    {
        // Create objects
        Battleship submarine = new Battleship("Submarine", 4);
        Battleship carrier = new Battleship("Carrier", 10);
        
        // Check initial positions
        System.out.println(submarine);
        System.out.println(carrier);
        
        
        // Test: Safely move submarine
        System.out.println("Submarine cleared to proceed");
        submarine.move(true);
        System.out.println(submarine);
        
        
        // Test unsafe to move carrier
        System.out.println("Carrier NOT cleared to proceed");
        carrier.move(false);
        System.out.println(carrier);
        
        
    }
}