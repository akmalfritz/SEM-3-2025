/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package praktikum10;

import java.text.DecimalFormat;

/**
 * Main class untuk menguji sistem pembayaran toko
 */
public class MainTugas {
    public static void main(String[] args) {
        // Format untuk menampilkan angka dengan 2 desimal
        DecimalFormat df = new DecimalFormat("#,###.00");
        
        System.out.println("===================================");
        System.out.println("   SISTEM PEMBAYARAN TOKO");
        System.out.println("===================================\n");
        
        // Membuat objek Elektronik
        System.out.println("--- PRODUK ELEKTRONIK ---");
        Pembayaran laptop = new Elektronik();
        double totalLaptop = laptop.hitungPajak(5000000);
        
        System.out.println("\n--- PRODUK MAKANAN ---");
        // Membuat objek Makanan
        Pembayaran snack = new Makanan();
        double totalSnack = snack.hitungPajak(50000);
        
        // Menghitung total belanja
        System.out.println("\n===================================");
        System.out.println("RINGKASAN PEMBAYARAN");
        System.out.println("===================================");
        System.out.println("Total Laptop: Rp " + df.format(totalLaptop));
        System.out.println("Total Snack: Rp " + df.format(totalSnack));
        System.out.println("-----------------------------------");
        System.out.println("TOTAL BELANJA: Rp " + df.format(totalLaptop + totalSnack));
        System.out.println("===================================");
        
        // Contoh tambahan dengan berbagai produk
        System.out.println("\n\n--- CONTOH TRANSAKSI LAIN ---\n");
        
        Pembayaran smartphone = new Elektronik();
        System.out.println("\nSmartphone:");
        smartphone.hitungPajak(3000000);
        
        Pembayaran buah = new Makanan();
        System.out.println("\nBuah-buahan:");
        buah.hitungPajak(150000);
    }
}