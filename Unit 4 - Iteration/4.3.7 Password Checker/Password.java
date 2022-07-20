import java.util.Scanner;

public class Password
{
    public static void main(String[] args)
    {
        // Prompt the user to enter their password and pass their string
        // to the passwordCheck method to determine if it is valid.
        Scanner scan = new Scanner(System.in);
        String password = scan.next(); 
        System.out.println(passwordCheck(password));
    }
    
    public static boolean passwordCheck(String password)
    {
        if (password.length() < 8) {
            return false;
        }
        
        String validCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZacbdefghijklmnopqrstuvwxyz1234567890";
        
        for (int i = 0; i < password.length(); i++) {
            String passwordCharacter = password.substring(i, i+1);
            
            for (int j = 0; j < validCharacters.length(); j++) {
                String currentCharacter = validCharacters.substring(j, j+1);
                
                if (passwordCharacter.equals(currentCharacter)) {
                    break;
                }
                
                if (j == validCharacters.length()-1 && passwordCharacter != currentCharacter) {
                    return false;
                }
            }
        }
        // Create this method so that it checks to see that the password
        // is at least 8 characters long and only contains letters 
        // and numbers.
        return true;
    }
}