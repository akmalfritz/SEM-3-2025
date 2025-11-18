package praktikum11;

public class TugasModul11 {
    public static void main(String[] args) {
        // Header
        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("    TUGAS MODUL 11: KOMPOSISI DAN AGREGASI");
        System.out.println("    Sistem Perpustakaan dengan Buku dan Pengarang");
        System.out.println("═══════════════════════════════════════════════════════\n");
        
        // TAHAP 1: Membuat Pengarang (Objek Independen - AGREGASI)
        System.out.println("📝 TAHAP 1: Membuat Objek Pengarang (Independen)");
        System.out.println("─────────────────────────────────────────────────────");
        Pengarang pengarang1 = new Pengarang("Tere Liye", "Indonesia");
        Pengarang pengarang2 = new Pengarang("Andrea Hirata", "Indonesia");
        Pengarang pengarang3 = new Pengarang("Pramoedya Ananta Toer", "Indonesia");
        Pengarang pengarang4 = new Pengarang("Dee Lestari", "Indonesia");
        
        System.out.println("✓ 4 Pengarang berhasil dibuat");
        System.out.println("  - " + pengarang1.getNamaPengarang());
        System.out.println("  - " + pengarang2.getNamaPengarang());
        System.out.println("  - " + pengarang3.getNamaPengarang());
        System.out.println("  - " + pengarang4.getNamaPengarang());
        
        // TAHAP 2: Membuat Perpustakaan
        System.out.println("\n📚 TAHAP 2: Membuat Perpustakaan");
        System.out.println("─────────────────────────────────────────────────────");
        PerpustakaanLengkap perpusDaerah = new PerpustakaanLengkap(
            "Kota Magelang", 
            "Jl. Pahlawan No. 123, Magelang"
        );
        System.out.println("✓ Perpustakaan berhasil dibuat");
        
        // TAHAP 3: Menambahkan Buku ke Perpustakaan (KOMPOSISI)
        System.out.println("\n📖 TAHAP 3: Menambahkan Buku (KOMPOSISI)");
        System.out.println("─────────────────────────────────────────────────────");
        System.out.println("Buku dibuat DI DALAM Perpustakaan...");
        perpusDaerah.tambahBuku("Bumi", "978-602-03-0654-4", pengarang1);
        perpusDaerah.tambahBuku("Laskar Pelangi", "978-979-22-2769-4", pengarang2);
        perpusDaerah.tambahBuku("Bumi Manusia", "978-979-461-228-4", pengarang3);
        perpusDaerah.tambahBuku("Perahu Kertas", "978-979-22-6515-3", pengarang4);
        perpusDaerah.tambahBuku("Bulan", "978-602-03-1454-9", pengarang1);
        
        // TAHAP 4: Menampilkan Info Perpustakaan
        System.out.println("\n📋 TAHAP 4: Menampilkan Informasi Perpustakaan");
        System.out.println("─────────────────────────────────────────────────────");
        perpusDaerah.infoPerpustakaan();
        
        // TAHAP 5: Demonstrasi KOMPOSISI
        System.out.println("\n🔍 TAHAP 5: Demonstrasi KOMPOSISI");
        System.out.println("─────────────────────────────────────────────────────");
        System.out.println("Ketika Perpustakaan dihapus, Buku ikut terhapus...");
        perpusDaerah.hapusPerpustakaan();
        
        // Verifikasi: Perpustakaan kosong
        System.out.println("\n✓ Verifikasi setelah penghapusan:");
        perpusDaerah.infoPerpustakaan();
        
        // TAHAP 6: Demonstrasi AGREGASI
        System.out.println("\n🔍 TAHAP 6: Demonstrasi AGREGASI");
        System.out.println("─────────────────────────────────────────────────────");
        System.out.println("Meskipun Buku terhapus, Pengarang TETAP EKSIS...\n");
        
        System.out.println("Bukti: Pengarang masih dapat diakses:");
        System.out.println("\n1. ");
        pengarang1.infoPengarang();
        System.out.println("\n2. ");
        pengarang2.infoPengarang();
        System.out.println("\n3. ");
        pengarang3.infoPengarang();
        System.out.println("\n4. ");
        pengarang4.infoPengarang();
        
        // KESIMPULAN
        System.out.println("\n\"===================================\"");
        System.out.println("              KESIMPULAN");
        System.out.println("\"===================================\"");
        System.out.println("✓ KOMPOSISI (Perpustakaan ↔ Buku):");
        System.out.println("  Ketika Perpustakaan dihapus, Buku ikut terhapus");
        System.out.println("  karena Buku adalah bagian integral Perpustakaan.");
        System.out.println();
        System.out.println("✓ AGREGASI (Buku ↔ Pengarang):");
        System.out.println("  Meskipun Buku dihapus, Pengarang tetap eksis");
        System.out.println("  karena Pengarang adalah objek independen.");
        System.out.println("===================================");
    }
}