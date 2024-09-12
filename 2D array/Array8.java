import java.util.*;
//Diagonal sum
public class Array8 {
   


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input matrix dimensions (assuming a square matrix)
        System.out.println("Enter the size of the matrix (n x n):");
        int n = sc.nextInt();

        int matrix[][] = new int[n][n];

        // Input matrix elements
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Calculate and print diagonal sum
        int diagonalSum = calculateDiagonalSum(matrix, n);
        System.out.println("Sum of diagonals: " + diagonalSum);
    }

    public static int calculateDiagonalSum(int[][] matrix, int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // Primary diagonal (where row == column)
            sum += matrix[i][i];
            
            // Secondary diagonal (where row + column == n - 1)
            // Ensure we don't double count the center element in an odd-sized matrix
            if (i != (n - 1 - i)) {
                sum += matrix[i][n - 1 - i];
            }
        }

        return sum;
    }
}

    

