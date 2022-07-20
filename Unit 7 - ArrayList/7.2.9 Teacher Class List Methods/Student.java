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
    //Add the static methods here:
    
    public static String getLastStudent() {
        return classList.get(classList.size() - 1).getName();
    }

    public static int getClassSize() {
        return classList.size();
    }
    
    public static void addStudent(int i, Student student) {
        classList.add(i, student);
        classList.remove(classList.size() - 1);
        
    }

    public static String getStudent(int i) {
        return classList.get(i).getName();
    }    
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