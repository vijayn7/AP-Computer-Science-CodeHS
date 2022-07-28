public class Sorter {

    public static void selectionSort(int[] arr)
    {
        int currentMinIndex;
        for (int i = 0; i < arr.length - 1; i++)
        {
            currentMinIndex = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[currentMinIndex])
                {
                    currentMinIndex = j;
                }
            }
            // swap numbers if needed
            if (i != currentMinIndex)
            {
                int temp = arr[currentMinIndex];
                arr[currentMinIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void insertionSort(int[] arr)
   {
       // note: we start with 1 instead of 0
       for (int i = 1; i < arr.length; i++)
       {
           int curNumber = arr[i];

           // Set index to be place to the left
           int curIndex = i-1;

           // We are still inbounds and the current number
           // is less than the current index
           while ( curIndex >= 0 && arr[curIndex] > curNumber)
           {
               // Shift the value at curIndex to the right one place
               arr[curIndex+1] = arr[curIndex];
               curIndex--;
           }

           // Put this number in the proper location
           arr[curIndex + 1] = curNumber;
       }
   }

    public static void mergeSort(int[] current, int length) {
        if (length < 2) {
            return;
        }
        int mid = length / 2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = current[i];
        }
        for (int i = mid; i < length; i++) {
            right[i - mid] = current[i];
        }
        mergeSort(left, mid);
        mergeSort(right, length - mid);

        merge(current, left, right);
    }

    public static void merge(int[] current, int[] left, int[] right)
    {
        int leftSize = left.length;
        int rightSize = right.length;

        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                current[k] = left[i];
                k++;
                i++;
            }
            else {
                current[k] = right[j];
                k++;
                j++;
            }
        }
        while (i < leftSize) {
            current[k] = left[i];
                k++;
                i++;
        }
        while (j < rightSize) {
            current[k] = right[j];
                k++;
                j++;
        }
    }
}