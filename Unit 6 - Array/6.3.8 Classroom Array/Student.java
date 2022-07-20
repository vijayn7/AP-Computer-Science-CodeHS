/**
 * The Student class holds data about a student.
 * The fields are firstName, lastName, and grade.
 */
public class Student
{
    // Attributes
    private String firstName;
    private String lastName;
    private int gradeLevel;
    
    // Constructor
    public Student(String fName, String lName, int grade)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    // new getter
    public String getLastName()
    {
        return lastName;
    }
    
    // new getter 
    public int getGradeLevel()
    {
        return gradeLevel;
    }
    
    /*
    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel;
    }
    */
}