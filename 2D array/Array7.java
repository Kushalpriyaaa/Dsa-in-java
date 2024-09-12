//Spiral matrix
import java.util.*;
public class Array7 {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input matrix dimensions
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];

        // Input matrix elements
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Call the function to print the matrix in spiral order
        printSpiral(matrix, n, m);
    }

    public static void printSpiral(int matrix[][], int n, int m) {
        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;

        System.out.println("Spiral order of the matrix:");
        while (top <= bottom && left <= right) {
            // Print top row (left to right)
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // Print right column (top to bottom)
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                // Print bottom row (right to left)
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                // Print left column (bottom to top)
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
}


    

