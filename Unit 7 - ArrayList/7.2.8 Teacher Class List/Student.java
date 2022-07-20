import java.util.ArrayList;
public class Student
{
    private String name;
    private int grade;
    //Implement classList here:
    private static ArrayList<Student> classList = new ArrayList<Student>();
    
    public Student(String name, int grade)
    {
        this.name = name;
        this.grade = grade;
        classList.add(this);
    }
    
    public String getName()
    {
        return this.name;
    }
    
    /*Don't change the code in this method!
    This method will print out all the Student names in the classList Array
    */
    public static String printClassList()
    {
        String names = "";
        for(Student name: classList)
        {
            names+= name.getName() + "\n";
        }
        return "Student Class List:\n" + names;
    }
}