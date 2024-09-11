import java.util.Arrays;

public class countingsort4 {
    public static void countingSort(int[] arr) {
        int n = arr.length;
        
        if (n == 0) {
            return;  // If the array is empty, nothing to sort
        }

        // Find the maximum value in the array
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        
        // Create the count array (of size max - min + 1 to handle negative numbers)
        int range = max - min + 1;
        int[] count = new int[range];

        // Store the count of each element
        for (int i = 0; i < n; i++) {
            count[arr[i] - min]++;
        }

        // Update the input array to store the sorted order
        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                arr[index++] = i + min;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, -2, 8, 3, 3, 1};
        System.out.println("Original array: " + Arrays.toString(arr));
        
        countingSort(arr);
        
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
