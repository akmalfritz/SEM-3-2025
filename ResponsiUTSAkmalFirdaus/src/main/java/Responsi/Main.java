/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author MyBook Hype AMD
 */
public class Main {
     public static void main(String[] args) {
        // 1. Output Produk (Elektronik)
        Elektronik pc = new Elektronik("pc", 160000, 1);
        System.out.println("1. Output Produk");
        System.out.println("================="); 
        pc.tampilkanInfo();
        System.out.println(); // baris kosong

        // 2. Output Pegawai (PegawaiTetap)
        PegawaiTetap akmal = new PegawaiTetap("akaml", 7500000, 19000000);
        System.out.println("2. Output Pegawai");
        System.out.println("=================");
        akmal.tampilkanInfo();
        System.out.println();

        // 3. Output Polimorfisme
        System.out.println("3. Output Polimorfisme");
        System.out.println("=================");
        // Produk referensi tapi memegang Makanan (polimorfisme)
        Produk snack = new Makanan("Keju Manis", 20000, "2025-9-2");
        snack.tampilkanInfo();
        System.out.println();

        // Pegawai referensi tapi memegang PegawaiKontrak (polimorfisme)
        Pegawai sari = new PegawaiKontrak("Sari", 5000000, 10);
        sari.tampilkanInfo();
    }
}
