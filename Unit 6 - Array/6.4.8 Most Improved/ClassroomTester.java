public class ClassroomTester 
{
    public static void main (String[] args)
    {
        Classroom c = new Classroom(2);
        
        Student ada = new Student("Ada", "Lovelace", 12);
        ada.addExamScore(44);
        ada.addExamScore(65);
        ada.addExamScore(77);

        Student alan = new Student("Alan", "Turing", 11);
        alan.addExamScore(38);
        alan.addExamScore(24);
        alan.addExamScore(31);

        // add students to classroom
        c.addStudent(ada);
        c.addStudent(alan);
        c.printStudents();
        
        Student mostImproved = c.getMostImprovedStudent();
        System.out.println("The most improved student is " + mostImproved.getName());
    }
}