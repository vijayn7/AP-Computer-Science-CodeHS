public class Student
{
    private String name;
    private int classYear;
   
   // Constructor goes here
   public Student(String name, int classYear) {
       this.name = name;
       this.classYear = classYear;
   }
   
   
    public String getName(){
       return name;
    }
   
    public int getClassYear(){
       return classYear;
    }
   
    public String toString(){
        return name + ", class of " + classYear;
    }
}