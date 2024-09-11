import java.util.*;

public class InsertionSort3 {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Start from the second element since the first element is already "sorted"
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // The element to be inserted into the sorted part
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];  // Shift element to the right
                j--;
            }

            // Insert the key at its correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Original array: " + Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
