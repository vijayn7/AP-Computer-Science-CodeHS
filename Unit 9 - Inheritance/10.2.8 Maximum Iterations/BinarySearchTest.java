import java.util.*;

public class BinarySearchTest {

    static int count;

    public static void main(String[] args) {
        
        // Use the helper code to generate arrays, calculate the max
        // iterations, and then find the actual iterations for a randomly
        // selected value.
        
        int target = 16;
        
        int length = 100;
        int[] arr = generateArrayOfLength(length);
        count = 0;
        binaryRec(arr, target, arr[0], arr[length - 1]);
        System.out.println("Array Size: " + length);
        System.out.println("Max iterations: " + binaryMax(length));
        System.out.println("Actual iterations: " + count);
        System.out.println();
        
        length = 1000;
        arr = generateArrayOfLength(length);
        count = 0;
        binaryRec(arr, target, arr[0], arr[length - 1]);
        System.out.println("Array Size: " + length);
        System.out.println("Max iterations: " + binaryMax(length));
        System.out.println("Actual iterations: " + count);
        System.out.println();
        
        length = 10000;
        arr = generateArrayOfLength(length);
        count = 0;
        binaryRec(arr, target, arr[0], arr[length - 1]);
        System.out.println("Array Size: " + length);
        System.out.println("Max iterations: " + binaryMax(length));
        System.out.println("Actual iterations: " + count);
        System.out.println();
        
        length = 100000;
        arr = generateArrayOfLength(length);
        count = 0;
        binaryRec(arr, target, arr[0], arr[length - 1]);
        System.out.println("Array Size: " + length);
        System.out.println("Max iterations: " + binaryMax(length));
        System.out.println("Actual iterations: " + count);
        System.out.println();
    }

    public static int binaryRec(int[] array, int target, int begin, int end) {
        if (begin <= end)
        {
        	int mid = (begin + end) / 2;
            count ++;
        	// Base Case
        	if (target == array[mid]) {
        			return mid;
        	}
    
            if (target < array[mid]) {
                return binaryRec(array, target, begin, mid - 1);
            }
    
            if (target > array[mid]) {
                return binaryRec(array, target, mid + 1, end);
            }
        }
		return -1; //Alternate Base Case - not found
    }

    public static int[] generateArrayOfLength(int length)
    {
        int[] arr = new int[length];
        for(int i = 0; i < length; i++)
        {
            arr[i] = (int)(Math.random() * 100);
        }

        Arrays.sort(arr);

        return arr;
    }

    private static int binaryMax(int length) {
        return (int) (Math.log(length) / Math.log(2)) + 1;
    }
}