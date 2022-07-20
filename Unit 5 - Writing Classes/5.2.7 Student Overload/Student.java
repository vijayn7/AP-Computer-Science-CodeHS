public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private String school;

    public Student(String firstName, String lastName, int gradeLevel, String school) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
        this.school = school;
    }
    
    public Student(String firstName, String lastName, int gradeLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
        
        if (gradeLevel >= 9 && gradeLevel <= 12) {
            this.school = "high school";
        } else if (gradeLevel >= 6 && gradeLevel <= 8) {
            this.school = "middle school";
        } else {
            this.school = "elementary school";
        }
    }

    public String toString()
    {
        return firstName + " " + lastName + " is in grade " + gradeLevel + " and goes to " + school;
    }
    
    public String getFirstName(){
        return firstName;
    }
}