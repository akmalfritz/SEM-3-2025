package praktikum11;

import java.util.ArrayList;
import java.util.List;

public class PerpustakaanLengkap {
    // Atribut
    private String namaPerpustakaan;
    private String alamat;
    private List<BukuLengkap> daftarBuku; // KOMPOSISI dengan BukuLengkap
    
    // Constructor
    public PerpustakaanLengkap(String namaPerpustakaan, String alamat) {
        this.namaPerpustakaan = namaPerpustakaan;
        this.alamat = alamat;
        this.daftarBuku = new ArrayList<>();
    }
    
    // Method untuk menambah buku (KOMPOSISI)
    // Objek BukuLengkap DIBUAT DI DALAM perpustakaan
    public void tambahBuku(String judul, String isbn, Pengarang pengarang) {
        BukuLengkap buku = new BukuLengkap(judul, isbn, pengarang);
        daftarBuku.add(buku);
        System.out.println("✓ Buku \"" + judul + "\" berhasil ditambahkan.");
    }
    
    // Method untuk menampilkan info perpustakaan
    public void infoPerpustakaan() {
        System.out.println("\n╔════════════════════════════════════════════╗");
        System.out.println("  PERPUSTAKAAN " + namaPerpustakaan.toUpperCase());
        System.out.println("╚════════════════════════════════════════════╝");
        System.out.println("Alamat: " + alamat);
        System.out.println("Total Koleksi: " + daftarBuku.size() + " buku");
        System.out.println("\n--- DAFTAR BUKU ---");
        
        if (daftarBuku.isEmpty()) {
            System.out.println("Belum ada buku dalam perpustakaan.");
        } else {
            for (int i = 0; i < daftarBuku.size(); i++) {
                System.out.println("\n[" + (i + 1) + "]");
                daftarBuku.get(i).infoBuku();
                System.out.println("---");
            }
        }
    }
    
    // Method untuk menghapus perpustakaan (demonstrasi KOMPOSISI)
    public void hapusPerpustakaan() {
        System.out.println("\n⚠ Perpustakaan " + namaPerpustakaan + " dihapus!");
        System.out.println("⚠ Semua buku (" + daftarBuku.size() + " buku) ikut terhapus (KOMPOSISI)");
        daftarBuku.clear();
    }
    
    // Getter
    public String getNamaPerpustakaan() {
        return namaPerpustakaan;
    }
}