public class ArrayAverage
{
   private int[] values;

   public ArrayAverage(int[] theValues)
   {
      values = theValues;
   }

   public double getAverage()
   {
    double sum = 0; 
    for (int value : values) {
         sum += value;
    }
    return sum / values.length;
   }
}