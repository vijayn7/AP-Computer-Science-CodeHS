import java.util.ArrayList;

public class PieTester
{
    public static void main(String[] args)
    {
        // Start here!
        Pie pie = new Pie("Orange", 8);
        Pie apple = new ApplePie(8);
        Pie pumpkin = new PumpkinPie(8, false);
        
        Pie[] pies = {pie, apple, pumpkin};
        
        for (Pie p : pies) {
            System.out.println("Pie: " + p.getType());
        }
    }
}