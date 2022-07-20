import java.util.Scanner;

public class RockPaperScissors
{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";
    private static boolean continueRun = true;
        
    public static String getWinner(String user, String computer)
    {
        if (user.equals(computer)) {
            return TIE;
        }
        else if (user.equals("rock") && computer.equals("paper")) {
            return COMPUTER_PLAYER;
        }
        else if (user.equals("paper") && computer.equals("scissors")) {
            return COMPUTER_PLAYER;
        }
        else if (user.equals("scissors") && computer.equals("rock")) {
            return COMPUTER_PLAYER;
        }
        return USER_PLAYER;
    }
    
    public static String getComputerChoice() {
        int computerChoice = Randomizer.nextInt(1, 3);
        
        if (computerChoice == 1) {
            return "rock";
        }
        else if (computerChoice == 2) {
            return "paper";
        }
        else {
            return "scissors";
        }
    }
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        while (continueRun) {
        
            System.out.println("Enter your choice (rock, paper, or scissors):");
            String user = scan.nextLine();
            if (user.equals("")) {
                System.out.println("Thanks for playing!");
                continueRun = false;
            } else {
                String computer = getComputerChoice();
                System.out.println("User: " + user);
                System.out.println("Computer: " + computer);
                System.out.println(getWinner(user, computer));
            }
        }
    }
}