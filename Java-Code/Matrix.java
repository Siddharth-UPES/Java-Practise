import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] A = new int[4][4];
        int[][] B = new int[4][4];
        int[][] AB = new int[4][4];
        int[][] BA = new int[4][4];
        System.out.println("Enter elements of matrix A (4x4):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter elements of matrix B (4x4):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                B[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                AB[i][j] = 0;
                for (int k = 0; k < 4; k++) {
                    AB[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                BA[i][j] = 0;
                for (int k = 0; k < 4; k++) {
                    BA[i][j] += B[i][k] * A[k][j];
                }
            }
        }
        System.out.println("\nMatrix AB:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(AB[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nMatrix BA:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(BA[i][j] + " ");
            }
            System.out.println();
        }
        boolean isEqual = true;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (AB[i][j] != BA[i][j]) {
                    isEqual = false;
                    break;
                }
            }
        }
        if (isEqual) {
            System.out.println("\nAB is equal to BA.");
        } else {
            System.out.println("\nAB is not equal to BA.");
        }
        scanner.close();
    }
}