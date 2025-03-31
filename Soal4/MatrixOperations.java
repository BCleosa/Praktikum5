package Soal4;

import java.util.Scanner;

public class MatrixOperations {
    
    // Fungsi untuk menginput matriks
    public static int[][] inputMatrix(int rows, int cols, Scanner scanner, String name) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Masukkan elemen untuk matriks " + name + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
    
    // Fungsi untuk menampilkan matriks
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
    
    // Fungsi untuk penjumlahan matriks
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }
    
    // Fungsi untuk perkalian matriks
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris matriks: ");
        int rows = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int cols = scanner.nextInt();
        
        int[][] matrixA = inputMatrix(rows, cols, scanner, "A");
        int[][] matrixB = inputMatrix(rows, cols, scanner, "B");
        
        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan Matriks");
        System.out.println("2. Perkalian Matriks");
        System.out.print("Pilihan: ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Hasil Penjumlahan Matriks:");
                displayMatrix(addMatrices(matrixA, matrixB));
                break;
            case 2:
                System.out.println("Hasil Perkalian Matriks:");
                displayMatrix(multiplyMatrices(matrixA, matrixB));
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
        
        scanner.close();
    }
}
