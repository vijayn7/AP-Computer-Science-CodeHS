public class Player 
{
    public static int totalPlayers;
    public static int maxPlayers = 10;
    
    public Player() 
    {
        totalPlayers++;
    }
    
    public static boolean gameFull() {
        if (totalPlayers >= maxPlayers) {
            return true;
        }
        return false;
    }
}