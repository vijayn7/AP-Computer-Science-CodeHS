import java.util.*;
public class AssignmentRunner
{
    public static void main(String[] args) {
        ArrayList<Assignment> assignments = new ArrayList<Assignment>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Please enter an assignment name (exit to quit): ");
            String name = sc.nextLine();
            if(name.equals("exit")) {
                break;
            }
            System.out.print("Please enter the available points: ");
            double pointTotal = sc.nextDouble();
            sc.nextLine();
            System.out.print("Please enter the earned points: ");
            double pointsEarned = sc.nextDouble();
            sc.nextLine();
            System.out.print("Is this a (t)est or (p)roject: ");
            String type = sc.nextLine();
            if(type.equals("t")) {
                System.out.print("Please enter the test date: ");
                String testDate = sc.nextLine();
                Assignment assignment = new Test(name, pointTotal, pointsEarned, testDate);
                assignments.add(assignment);
            }
            else {
                System.out.print("Please enter the due date: ");
                String dueDate = sc.nextLine();
                System.out.print("Group project? true or false: ");
                boolean groups = sc.nextBoolean();
                sc.nextLine();
                Assignment assignment = new Project(name, pointTotal, pointsEarned, dueDate, groups);
                assignments.add(assignment);
            }
        }
        System.out.print("Your average: " + average(assignments));
    }
    
    public static double average(ArrayList<Assignment> assignments) {
        double totalPointsEarned = 0;
        double totalPointsAvailable = 0;
        
        for(Assignment assignment : assignments) {
            totalPointsEarned += assignment.getEarnedPoints();
            totalPointsAvailable += assignment.getAvailablePoints();
        }
        return 100 * (totalPointsEarned / totalPointsAvailable);
    }
}