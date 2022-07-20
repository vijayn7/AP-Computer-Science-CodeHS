public class Teen 
{
    private String firstName;
    private String lastName;
    private int grade;
    private Boolean textMessages;

    // Constructor to make a teen with a first and last name, grade in school, 
    // and whether they text message others and need to write texts to others. 
    
    // This defines the state of the teen.
    public Teen(String theFirstName, String theLastName, int theGrade, Boolean theTextMessages)
    {
        firstName = theFirstName;
        lastName = theLastName;
        grade = theGrade;
        textMessages = theTextMessages;
    }
    
    // toString method to print out the state of teen object
    public String toString()
    {
        return firstName + " " + lastName + " is in grade " + grade + " and wants to send this text:";
    }
    
    // Create this method so that it changes the text message 
    // and places the word "like" in place of each space 
    // in the message.
    public String teenTalk(String text)
    {
        return text.replace(" ", " like ");
    }
    
}