/* This is the Scratchpad!
This file is not graded, but you can use it to test your code.

You can write and test your method in the Scratchpad, but make
sure to copy and paste it into the Unit Test file before checking
your answer. Remember to only copy and paste the method you want
to submit, not all of your tests.
*/

public class Scratchpad
{
    public static void main(String[] args)
    {
        Assignment[] assignments = new Assignment[2];
        Assignment a = new Assignment("QUIZ", 4, 5);
        Assignment b = new Assignment("QUIZ", 5, 6);
        assignments[0] = a;
        assignments[1] = b;
        
        System.out.println(quizAve(assignments));
    }

    public static double quizAve(Assignment[] assignments)
{
    double earned = 0;
    double available = 0;
    double sum = 0;
    int count = 0;
    
    for (Assignment assignment : assignments) {
        if (assignment.getType().equals("QUIZ")) {
            earned = assignment.getEarned();
            available = assignment.getAvailable();
            sum = (double)assignment.getEarned() / (double)assignment.getAvailable();
            count++;
        }
    }
    return ;
}
}