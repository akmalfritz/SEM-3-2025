package praktikum11;

public class TestAgregasi {
    public static void main(String[] args) {
        // Header program
        System.out.println("===================================");
        System.out.println("   DEMONSTRASI AGREGASI");
        System.out.println("===================================\n");
        
        // LANGKAH 1: Membuat objek Anggota secara INDEPENDEN
        System.out.println("LANGKAH 1: Membuat Objek Anggota (Independen)");
        Anggota anggota1 = new Anggota("Budi Santoso", "A001");
        Anggota anggota2 = new Anggota("Siti Aminah", "A002");
        Anggota anggota3 = new Anggota("Joko Widodo", "A003");
        System.out.println("✓ 3 Anggota berhasil dibuat:");
        System.out.println("  - " + anggota1.getNama());
        System.out.println("  - " + anggota2.getNama());
        System.out.println("  - " + anggota3.getNama());
        
        // LANGKAH 2: Membuat objek Klub
        System.out.println("\n\nLANGKAH 2: Membuat Klub");
        Klub klubSepakbola = new Klub("PERSIJA JUNIOR");
        System.out.println("✓ Klub 'PERSIJA JUNIOR' berhasil dibuat.");
        
        // LANGKAH 3: Menambahkan anggota yang SUDAH ADA ke klub
        System.out.println("\n\nLANGKAH 3: Menambahkan Anggota ke Klub");
        klubSepakbola.tambahAnggota(anggota1);
        klubSepakbola.tambahAnggota(anggota2);
        klubSepakbola.tambahAnggota(anggota3);
        
        // LANGKAH 4: Menampilkan info klub
        System.out.println("\n\nLANGKAH 4: Menampilkan Informasi Klub");
        klubSepakbola.infoKlub();
        
        // LANGKAH 5: Menghapus satu anggota dari klub
        System.out.println("\n\nLANGKAH 5: Menghapus Anggota dari Klub");
        klubSepakbola.hapusAnggota(anggota2);
        
        // LANGKAH 6: Menampilkan info klub setelah anggota keluar
        System.out.println("\n\nLANGKAH 6: Informasi Klub Setelah Anggota Keluar");
        klubSepakbola.infoKlub();
        
        // LANGKAH 7: Membuktikan anggota2 MASIH EKSIS meskipun keluar
        System.out.println("\n\nLANGKAH 7: Bukti Anggota yang Keluar MASIH EKSIS");
        System.out.println("Info anggota yang keluar dari klub:");
        anggota2.infoAnggota();
        System.out.println("✓ Anggota masih bisa diakses!");
        
        // LANGKAH 8: Membubarkan klub
        System.out.println("\n\nLANGKAH 8: Membubarkan Klub (AGREGASI)");
        klubSepakbola.bubarkanKlub();
        
        // LANGKAH 9: Verifikasi klub kosong
        System.out.println("\n\nLANGKAH 9: Verifikasi Klub Setelah Dibubarkan");
        klubSepakbola.infoKlub();
        
        // LANGKAH 10: Membuktikan SEMUA anggota MASIH EKSIS
        System.out.println("\n\nLANGKAH 10: Bukti SEMUA Anggota MASIH EKSIS");
        System.out.println("Meskipun klub dibubarkan, anggota tetap dapat diakses:\n");
        System.out.println("1. ");
        anggota1.infoAnggota();
        System.out.println("\n2. ");
        anggota2.infoAnggota();
        System.out.println("\n3. ");
        anggota3.infoAnggota();
        
        // Kesimpulan
        System.out.println("\n\n===================================");
        System.out.println("KESIMPULAN:");
        System.out.println("Ini adalah AGREGASI karena ketika");
        System.out.println("Klub dibubarkan, Anggota TETAP");
        System.out.println("eksis (hubungan longgar).");
        System.out.println("===================================");
    }
}