public class PrintOdds
{
   public static void main(String[] args)
   {
     int[ ] values = {17, 34, 56, 2, 19, 100};
        
     for (int value : values)
     {
       if (value % 2 == 1)
           System.out.println(value + " is odd");
     }
   }
}