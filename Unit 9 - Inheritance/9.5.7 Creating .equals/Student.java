public class Student extends Person {

    private int grade;

    public Student(String name, String birthday, int grade){
        super(name, birthday);
        this.grade = grade;
    }

    public int getGrade(){
        return grade;
    }
}