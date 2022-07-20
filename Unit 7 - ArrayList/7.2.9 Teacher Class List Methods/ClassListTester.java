public class ClassListTester
{
    public static void main(String[] args)
    {
        //You don't need to change anything here, but feel free to add more Students!
        Student alan = new Student("Alan", 11);
        Student kevin = new Student("Kevin", 10);
        Student annie = new Student("Annie", 12);
        System.out.println(Student.printClassList());
        
        System.out.println(Student.getLastStudent());
        System.out.println(Student.getStudent(1));
    
        Student.addStudent(2, new Student("Trevor", 12));
        System.out.println(Student.printClassList());
        System.out.println(Student.getClassSize());
    }
    
    
    
}