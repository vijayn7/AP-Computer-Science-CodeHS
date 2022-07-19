public class GamesTester
{
    public static void main(String[] args)
    {
        NumberGames game = new NumberGames(3);
        
        // Double the number
        // Print it out
        System.out.println(game.doubleNumber());
        
        
        // Square the number
        // Print it out
        System.out.println(game.squareNumber());
        
        
        // Double the number again
        // Print it out
        System.out.println(game.doubleNumber());
        
        
        // Get the number and store the value
        // Print it out to see that getNumber does
        // not modify the number
        System.out.println(game.getNumber());
        

    }
}