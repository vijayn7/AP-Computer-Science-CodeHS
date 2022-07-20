public class ExerciseTester
{
    public static void main(String[] args)
    {
        Exercise exercise1 = new Exercise();
        Exercise exercise2 = new Exercise("Who needs this anyways?", "Java", 9001);
        
        System.out.println(exercise1.getTitle());
        System.out.println(exercise2.getTitle());
    }
}