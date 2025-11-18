package praktikum11;

public class TestKomposisi {
    public static void main(String[] args) {
        // Header program
        System.out.println("===================================");
        System.out.println("   DEMONSTRASI KOMPOSISI");
        System.out.println("===================================\n");
        
        // Membuat objek Perpustakaan
        System.out.println("LANGKAH 1: Membuat Perpustakaan");
        Perpustakaan perpus = new Perpustakaan("Kota Magelang");
        System.out.println("✓ Perpustakaan 'Kota Magelang' berhasil dibuat.\n");
        
        // Menambahkan buku ke perpustakaan
        System.out.println("LANGKAH 2: Menambahkan Buku ke Perpustakaan");
        perpus.tambahBuku("Pemrograman Java", "978-979-123-456-7");
        perpus.tambahBuku("Basis Data", "978-979-123-457-8");
        perpus.tambahBuku("Algoritma dan Struktur Data", "978-979-123-458-9");
        
        // Menampilkan info perpustakaan
        System.out.println("\nLANGKAH 3: Menampilkan Informasi Perpustakaan");
        perpus.infoPerpustakaan();
        
        // Menutup perpustakaan (demonstrasi komposisi)
        System.out.println("\n\nLANGKAH 4: Menutup Perpustakaan (KOMPOSISI)");
        perpus.tutupPerpustakaan();
        
        // Menampilkan info setelah perpustakaan ditutup
        System.out.println("\nLANGKAH 5: Verifikasi Setelah Penutupan");
        perpus.infoPerpustakaan();
        
        // Kesimpulan
        System.out.println("\n===================================");
        System.out.println("KESIMPULAN:");
        System.out.println("Ini adalah KOMPOSISI karena ketika");
        System.out.println("Perpustakaan dihapus, Buku ikut");
        System.out.println("terhapus (hubungan sangat kuat).");
        System.out.println("===================================");
    }
}