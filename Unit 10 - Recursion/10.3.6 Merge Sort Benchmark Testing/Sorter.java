public class Sorter {

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