package FAKTORIAL;

import java.util.Scanner;

class Faktorial {
    public int hitungFaktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * hitungFaktorial(n - 1);
    }
}

public class FaktorialImplement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Faktorial faktorial = new Faktorial();
        char choice;
        
        do {
            System.out.print("Masukkan angka untuk menghitung faktorial: ");
            int number = scanner.nextInt();
            
            if (number < 0) {
                System.out.println("Faktorial tidak terdefinisi untuk bilangan negatif.");
            } else {
                int result = faktorial.hitungFaktorial(number);
                System.out.println("Faktorial dari " + number + " adalah " + result);
            }
            
            System.out.print("Apakah Anda ingin melanjutkan? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        
        scanner.close();
    }
}
