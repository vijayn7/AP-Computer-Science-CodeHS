public class WorkShift
{
    public static void main(String[] args)
    {
        int hours = 20;
        int minutes = 42;
        int seconds = 16;
        
        int total = ((hours * 60 * 60) + (minutes * 60) + seconds);
        
        System. out.println("Total seconds " +total);
    }
}