import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions for matrix A
        System.out.print("Enter number of rows for Matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter number of columns for Matrix A: ");
        int colsA = scanner.nextInt();

        // Input dimensions for matrix B
        System.out.print("Enter number of rows for Matrix B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter number of columns for Matrix B: ");
        int colsB = scanner.nextInt();

        // Check if multiplication is possible
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication not possible. Columns of A must equal rows of B.");
            return;
        }

        int[][] A = new int[rowsA][colsA];
        int[][] B = new int[rowsB][colsB];
        int[][] result = new int[rowsA][colsB];

        // Input elements for matrix A
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }

        // Input elements for matrix B
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = scanner.nextInt();
            }
        }

        // Multiply matrices
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print result
        System.out.println("Result of Matrix Multiplication:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
