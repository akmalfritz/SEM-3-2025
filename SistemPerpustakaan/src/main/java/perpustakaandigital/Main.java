/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaandigital;

import perpustakaan.model.*;
import perpustakaan.service.Perpustakaan;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();
        String namaFile = "perpustakaan.dat";
        
        try {
            // Tambah buku
            System.out.println("=== MENAMBAH DATA ===");
            perpus.tambahBuku(new Buku("B001", "Java Programming", 
                                      "John Doe"));
            perpus.tambahBuku(new Buku("B002", "OOP Concepts", 
                                      "Jane Smith"));
            perpus.tambahBuku(new Buku("B003", "Data Structures", 
                                      "Bob Wilson"));
            System.out.println("Buku berhasil ditambahkan!");
            
            // Tambah anggota
            perpus.tambahAnggota(new Anggota("A001", "Ahmad"));
            perpus.tambahAnggota(new Anggota("A002", "Budi"));
            System.out.println("Anggota berhasil ditambahkan!");
            
            // Tampilkan data
            perpus.tampilkanKoleksi();
            perpus.tampilkanAnggota();
            
            // Buat peminjaman
            System.out.println("\n=== MEMBUAT PEMINJAMAN ===");
            Anggota ahmad = new Anggota("A001", "Ahmad");
            perpus.buatPeminjaman("P001", ahmad, 
                                 Arrays.asList("B001", "B002"));
            System.out.println("Peminjaman berhasil dibuat!");
            
            // Tampilkan setelah peminjaman
            perpus.tampilkanKoleksi();
            
            // Simpan data
            System.out.println("\n=== MENYIMPAN DATA ===");
            perpus.simpanData(namaFile);
            
            // Muat data
            System.out.println("\n=== MEMUAT DATA ===");
            Perpustakaan perpusMuat = Perpustakaan.muatData(namaFile);
            System.out.println("Data berhasil dimuat!");
            perpusMuat.tampilkanKoleksi();
            
        } catch (Exception e) {
            System.err.println("ERROR TERJADI: " + e.getMessage());
            e.printStackTrace();
        }
    }
}