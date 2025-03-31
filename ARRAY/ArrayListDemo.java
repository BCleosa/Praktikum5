package ARRAY;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah data: ");
        int jumlahData = scanner.nextInt();
        
        ArrayList<Integer> nilai1 = new ArrayList<>();
        ArrayList<Integer> nilai2 = new ArrayList<>();
        ArrayList<Integer> jumlah = new ArrayList<>();
        ArrayList<Integer> kurang = new ArrayList<>();
        ArrayList<Integer> kali = new ArrayList<>();
        ArrayList<Double> bagi = new ArrayList<>();

        System.out.println("Masukkan nilai untuk ArrayList 1:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Nilai 1 index ke-" + i + " = ");
            nilai1.add(scanner.nextInt());
        }

        System.out.println("Masukkan nilai untuk ArrayList 2:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Nilai 2 index ke-" + i + " = ");
            nilai2.add(scanner.nextInt());
        }

        for (int i = 0; i < jumlahData; i++) {
            jumlah.add(nilai1.get(i) + nilai2.get(i));
            kurang.add(nilai1.get(i) - nilai2.get(i));
            kali.add(nilai1.get(i) * nilai2.get(i));
            if (nilai2.get(i) != 0) {
                bagi.add((double) nilai1.get(i) / nilai2.get(i));
            } else {
                bagi.add(Double.NaN); // Menangani pembagian oleh nol
            }
        }

        System.out.println("\nHasil Operasi:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Index ke-" + i + " -> Tambah: " + jumlah.get(i) + 
                               ", Kurang: " + kurang.get(i) + 
                               ", Kali: " + kali.get(i) + 
                               ", Bagi: " + (nilai2.get(i) != 0 ? bagi.get(i) : "Tidak bisa dibagi oleh 0"));
        }

        scanner.close();
    }
}