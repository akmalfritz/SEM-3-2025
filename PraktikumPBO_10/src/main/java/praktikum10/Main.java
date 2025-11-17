/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package praktikum10;

/**
 * Class Main untuk menguji implementasi interface OperasiHitung
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRAKTIKUM INTERFACE ===");
        System.out.println("Demonstrasi Penggunaan Interface OperasiHitung\n");
        
        // Membuat objek Penjumlahan dengan tipe data Interface
        OperasiHitung penjumlahan = new Penjumlahan();
        System.out.println("Operasi Penjumlahan:");
        System.out.println("10 + 5 = " + penjumlahan.hitung(10, 5));
        
        // Membuat objek Pengurangan dengan tipe data Interface
        OperasiHitung pengurangan = new Pengurangan();
        System.out.println("\nOperasi Pengurangan:");
        System.out.println("10 - 5 = " + pengurangan.hitung(10, 5));
        
        // Contoh penggunaan lain
        System.out.println("\n=== CONTOH TAMBAHAN ===");
        System.out.println("25 + 15 = " + penjumlahan.hitung(25, 15));
        System.out.println("50 - 20 = " + pengurangan.hitung(50, 20));
    }
}