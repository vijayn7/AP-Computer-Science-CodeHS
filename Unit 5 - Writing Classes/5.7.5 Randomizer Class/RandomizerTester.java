public class RandomizerTester
{
    public static void main(String[] args)
    {
    
        System.out.println("Results of Randomizer.nextInt()");
        for(int i = 0; i < 10; i++)
        {
            System.out.println(Randomizer.nextInt());
        }
       
        //Initialize min and max for Randomizer.nextInt(min,max)
        int min = 5;
        int max = 10;
        System.out.println("\nResults of Randomizer.nextInt(5,10)");
        for(int i = 0; i < 10; i++)
        {
            System.out.println(Randomizer.nextInt(min ,max));
        }
        
    }
}