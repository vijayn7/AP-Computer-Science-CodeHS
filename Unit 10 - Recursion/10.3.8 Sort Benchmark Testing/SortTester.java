import java.util.ArrayList;

public class SortTester {

    public static void main(String[] args) {
        long startTime, endTime;
        int arraySize = 20000;
        int[] testArray;

        testArray = makeRandomArray(arraySize);
        startTime = System.currentTimeMillis();
        Sorter.selectionSort(testArray);
        endTime = System.currentTimeMillis();
        System.out.println("Selection Sort: " + (endTime - startTime));
        
        testArray = makeRandomArray(arraySize);
        startTime = System.currentTimeMillis();
        Sorter.insertionSort(testArray);
        endTime = System.currentTimeMillis();
        System.out.println("Insertion Sort: " + (endTime - startTime));
        
        testArray = makeRandomArray(arraySize);
        startTime = System.currentTimeMillis();
        Sorter.mergeSort(testArray, arraySize);
        endTime = System.currentTimeMillis();
        System.out.println("Merge Sort: " + (endTime - startTime));
    }

    /**
     * This method returns an array in random order
     * @param number- the length of the desired almost sorted array
     * @return array - returns an array length number.
     */

    public static int[] makeRandomArray(int number){
        int[] array = new int[number];
        ArrayList<Integer> sorted = new ArrayList<Integer>(number);
        // Create the sorted list
        for (int i = 0; i < number; i++){
            sorted.add(i);
        }

        // Now shuffle it.
        int index = 0;
        while (sorted.size() > 0){
            int randomIndex = (int)(Math.random()*sorted.size());
            array[index] = sorted.remove(randomIndex);
            index ++;
        }

        return array;
    }

    /**
     * This method returns an array in reverse order starting from the parameter number
     * and going to the value 0.
     * @param number- the length of the desired almost sorted array
     * @return array - returns an array length number. Index 0 is the value number, and
     * index array.length-1 is 0
     */
    public static int[] makeReverseArray(int number)
   {
       int[] array = new int[number];
       int counter = number;
       for(int i = 0; i < number; i++)
       {
           array[i] = counter;
           counter--;
       }
       return array;
   }

   /**
    * This method returns an array that is almost sorted, but the last index
    * and last index-1 are switched.
    * @param number- the length of the desired almost sorted array
    * @return array - returns an array length number with index array.length - 1
    * and array.length- 2 swapped.
    */
   public static int[] makeAlmostSortedArray(int number)
   {
       int[] array = new int[number];
       for(int i= 0; i < number; i++)
       {
           array[i] = i+1;
       }
       int temp = array[array.length-1];
       array[array.length-1] = array[array.length - 2];
       array[array.length - 2] = temp;
       return array;

   }
}