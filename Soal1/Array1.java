package Soal1;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Jumlah Data: ");
        int jumlahData = scanner.nextInt();
        int[] dataArray = new int[jumlahData];
        
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Data ke-" + (i + 1) + " = ");
            dataArray[i] = scanner.nextInt();
        }
        
        System.out.println("\nHasil nilai:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Hasil nilai[" + i + "]=" + dataArray[i]);
        }
        
        System.out.println("\nBUILD SUCCESSFUL");
        scanner.close();
    }
}