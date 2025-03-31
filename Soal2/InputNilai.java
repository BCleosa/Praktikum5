package Soal2;

import java.util.Scanner;

class Mahasiswa {
    String nama;
    int nilai;

    // Konstruktor
    Mahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    // Method untuk menampilkan data mahasiswa
    void tampilkan() {
        System.out.println("Nama: " + nama + " | Nilai: " + nilai);
    }
}

public class InputNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine(); // Konsumsi newline

        // Array objek untuk menyimpan data mahasiswa
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[jumlah];

        // Input data
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            String nama = input.nextLine();
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            int nilai = input.nextInt();
            input.nextLine(); // Konsumsi newline
            
            daftarMahasiswa[i] = new Mahasiswa(nama, nilai);
        }

        // Tampilkan daftar nilai
        daftarNilai(daftarMahasiswa);
        input.close();
    }

    // Method untuk menampilkan daftar mahasiswa dan nilainya
    static void daftarNilai(Mahasiswa[] daftar) {
        System.out.println("\n=== Daftar Nilai Mahasiswa ===");
        for (Mahasiswa mhs : daftar) {
            mhs.tampilkan();
        }
    }
}