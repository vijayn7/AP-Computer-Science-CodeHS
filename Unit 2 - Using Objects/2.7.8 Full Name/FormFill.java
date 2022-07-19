public class FormFill
{
    
    private String fName;
    private String lName;
    private int streetNumber;
    private String streetName;
    private String aptNumber;
    
    // Constructor that sets the first and last name
    // streetNumber defaults to 0
    // the others default to an empty String
    public FormFill(String firstName, String lastName)
    {
        fName = firstName;
        lName = lastName;
    }
    
    // Sets streetNumber, streetName, and aptNumber to the given
    // values
    public void setAddress(int number, String street, String apt)
    {
        streetNumber = number;
        streetName = street;
        aptNumber = apt;
    }
    
    // Returns a string with the name formatted like
    // a doctor would write the name on a file
    // 
    // Return string should be formatted 
    // with the last name, then a comma and space, then the first name.
    // For example: LastName, FirstName
    public String fullName()
    {
        String name = lName + ", " + fName;
        return name;
    }
    
    // Returns the formatted address
    // Formatted like this
    // 
    // StreetNumber StreetName
    // Apt AptNumber
    //
    // You will need to use the escape character \n
    // To create a new line in the String
    public String streetAddress()
    {
        String ad = streetNumber + " " + streetName + "\nApt " + aptNumber;
        return ad;
    }
    
    // Returns a string with the credit card information
    // Formatted like this:
    // 
    // Card Number: Card#
    // Expires: expMonth/expYear
    // 
    // Take information as parameters so we don't store sensitive information!
    // You will need to use the escape character \n
    public String creditCardInfo(int creditCardNumber, int expMonth, int expYear)
    {
        String cred = "Card Number: " + creditCardNumber + "\nExpires: " + expMonth + "/" + expYear;
        return cred;
    }
    
}
