package praktikum11;

import java.util.ArrayList;
import java.util.List;

public class Klub {
    // Atribut
    private String namaKlub;
    private List<Anggota> anggotaList; // Koleksi referensi objek Anggota (AGREGASI)
    
    // Constructor
    public Klub(String namaKlub) {
        this.namaKlub = namaKlub;
        this.anggotaList = new ArrayList<>();
    }
    
    // Method untuk menambah anggota (AGREGASI)
    // Menerima objek Anggota yang SUDAH DIBUAT di luar klub
    public void tambahAnggota(Anggota anggota) {
        anggotaList.add(anggota); // Hanya menyimpan referensi
        System.out.println("✓ " + anggota.getNama() + " bergabung dengan " + namaKlub);
    }
    
    // Method untuk menghapus anggota dari klub
    public void hapusAnggota(Anggota anggota) {
        if (anggotaList.remove(anggota)) {
            System.out.println("✓ " + anggota.getNama() + " keluar dari " + namaKlub);
        } else {
            System.out.println("✗ Anggota tidak ditemukan dalam klub.");
        }
    }
    
    // Method untuk menampilkan info klub
    public void infoKlub() {
        System.out.println("\n=== KLUB " + namaKlub + " ===");
        System.out.println("Jumlah Anggota: " + anggotaList.size());
        System.out.println("\nDaftar Anggota:");
        
        if (anggotaList.isEmpty()) {
            System.out.println("Tidak ada anggota dalam klub.");
        } else {
            for (int i = 0; i < anggotaList.size(); i++) {
                System.out.println("\n" + (i + 1) + ". ");
                anggotaList.get(i).infoAnggota();
            }
        }
    }
    
    // Method untuk membubarkan klub (demonstrasi AGREGASI)
    public void bubarkanKlub() {
        System.out.println("\n⚠ Klub " + namaKlub + " dibubarkan.");
        System.out.println("⚠ Anggota (" + anggotaList.size() + " orang) tetap eksis sebagai individu.");
        anggotaList.clear(); // Hanya menghapus referensi, bukan objek anggota
    }
}