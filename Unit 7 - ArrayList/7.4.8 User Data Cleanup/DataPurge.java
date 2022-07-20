import java.util.ArrayList;

public class DataPurge
{
    public static void removeDuplicates(ArrayList<String> emails) {
        for (int i = 0; i < emails.size(); i++) {
            String email = emails.get(i);
            for (int j = i + 1; j < emails.size(); j++) {
                if (email.equals(emails.get(j))) {
                    emails.remove(j);
                    j--;
                }
            }
        }
    }
    
    public static void removeAOL(ArrayList<String> emails) {
        for (int i = 0; i < emails.size(); i++) {
            String lastSeven = emails.get(i).substring(emails.get(i).length() - 7, emails.get(i).length());
            if ("aol.com".equals(lastSeven)) {
                System.out.println(emails.get(i) + " is being removed");
                emails.remove(i);
                i--;
            }
        }
    }
    
    public static boolean containsOnlyEmails(ArrayList<String> emails) {
        for (String email : emails) {
            boolean foundA = email.contains("@");
            boolean foundB = email.contains(".");
            if (!foundA || !foundB) {
                return false;
            }
        }
        return true;
    }
}