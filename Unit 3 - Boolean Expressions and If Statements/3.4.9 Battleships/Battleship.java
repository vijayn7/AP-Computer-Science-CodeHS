public class Battleship
{
    private String name;  // type of ship
    private int power;   // power of attack in range [1 - 10]
    private int health; // health of the ship
    
    // Constructor
    public Battleship(String shipType, int attackPower)
    {
        name = shipType;
        power = attackPower;
        health = 100;
    }
    
    // Modifies the health of the battleship
    public void isAttacked(int attackPower)
    {
        if (attackPower >= 8) {
            health -= 7;
        } else if (attackPower < 4) {
            health -= 3;
        } else {
            health -= 5;
        }

    }
    
    // Returns true if the health of
    // the ship is greater than 0
    public boolean stillFloating()
    {
        if (health > 0) {
            return true;
        }
        return false;
    }
    
    // Returns the power of the ship
    public int getPower()
    {
        return power;
    }
    
    // Returns string representation in the form
    // Battleship name
    public String toString()
    {
        return name + "(" + health + ")";    
    }
    
}