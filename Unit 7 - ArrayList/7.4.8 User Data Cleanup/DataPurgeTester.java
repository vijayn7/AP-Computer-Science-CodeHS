import java.util.ArrayList;

public class DataPurgeTester
{
    public static void main(String[] args)
    {
        ArrayList<String> emails = new ArrayList<String>();
        addEmails(emails);
        System.out.println("List is all emails: " +DataPurge.containsOnlyEmails(emails));
        DataPurge.removeAOL(emails);
        DataPurge.removeDuplicates(emails);
        System.out.println(emails);
    }
    
    
    
    public static void addEmails(ArrayList<String> emails)
    {
        emails.add("improv@gmail.com");
        emails.add("tbmaddux@icloud.com");
        emails.add("rfisher@outlook.com");
        emails.add("anicolao@verizon.net");
        emails.add("openldap@me.com");
        emails.add("improv@gmail.com");
        emails.add("improv@gmail.com");
        emails.add("improv@gmail.com");
        emails.add("alias@sbcglobal.net");
        emails.add("portele@me.com");
        emails.add("doormat@icloud.com");
        emails.add("mailarc@aol.com");
        emails.add("portele@me.com");
        emails.add("rmcfarla@optonline.net");
        emails.add("chrisk@verizon.net");
        emails.add("gordonjcp@aol.com");
        emails.add("improv@gmail.com");
    }
}