package praktikum11;

import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
    // Atribut
    private String namaPerpustakaan;
    private List<Buku> bukuList; // Koleksi objek Buku (KOMPOSISI)
    
    // Constructor
    public Perpustakaan(String namaPerpustakaan) {
        this.namaPerpustakaan = namaPerpustakaan;
        this.bukuList = new ArrayList<>(); // Inisialisasi list kosong
    }
    
    // Method untuk menambah buku (KOMPOSISI)
    // Objek Buku DIBUAT DI DALAM perpustakaan
    public void tambahBuku(String judul, String isbn) {
        Buku buku = new Buku(judul, isbn); // Penciptaan objek buku
        bukuList.add(buku); // Menambahkan ke koleksi
        System.out.println("✓ Buku \"" + judul + "\" berhasil ditambahkan.");
    }
    
    // Method untuk menampilkan semua buku
    public void infoPerpustakaan() {
        System.out.println("\n=== PERPUSTAKAAN " + namaPerpustakaan + " ===");
        System.out.println("Jumlah Buku: " + bukuList.size());
        System.out.println("\nDaftar Buku:");
        
        if (bukuList.isEmpty()) {
            System.out.println("Tidak ada buku dalam perpustakaan.");
        } else {
            for (int i = 0; i < bukuList.size(); i++) {
                System.out.println("\n" + (i + 1) + ". ");
                bukuList.get(i).infoBuku();
            }
        }
    }
    
    // Method untuk menutup perpustakaan (demonstrasi KOMPOSISI)
    public void tutupPerpustakaan() {
        System.out.println("\n⚠ Perpustakaan " + namaPerpustakaan + " ditutup.");
        System.out.println("⚠ Semua buku (" + bukuList.size() + " buku) ikut terhapus.");
        bukuList.clear(); // Menghapus semua buku
    }
}