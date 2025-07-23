import java.util.Scanner;

public class Q1_Matrix {

        // Method to multiply two matrices
        public static int[][] multiplyMatrices(int[][] A, int[][] B) {
            int[][] product = new int[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    product[i][j] = 0;
                    for (int k = 0; k < 4; k++) {
                        product[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            return product;
        }

        // Method to print a matrix
        public static void printMatrix(int[][] matrix) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

        // Method to check if two matrices are equal
        public static boolean areMatricesEqual(int[][] A, int[][] B) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (A[i][j] != B[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input matrices A and B
            int[][] A = new int[4][4];
            int[][] B = new int[4][4];

            System.out.println("Enter matrix A (4x4): ");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    A[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Enter matrix B (4x4): ");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    B[i][j] = scanner.nextInt();
                }
            }

            // Multiply matrices A and B (AB and BA)
            int[][] AB = multiplyMatrices(A, B);
            int[][] BA = multiplyMatrices(B, A);

            // Print the product AB
            System.out.println("Product of A * B (AB): ");
            printMatrix(AB);

            // Print the product BA
            System.out.println("Product of B * A (BA): ");
            printMatrix(BA);

            // Check if AB = BA
            if (areMatricesEqual(AB, BA)) {
                System.out.println("AB is equal to BA.");
            } else {
                System.out.println("AB is not equal to BA (in general).");
            }

            scanner.close();
        }
    }

