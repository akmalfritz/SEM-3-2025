package perpustakaan.service;
import perpustakaan.model.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Perpustakaan implements Serializable {
    private List<ItemPerpustakaan> koleksiBuku;
    private List<Anggota> daftarAnggota;
    private List<Peminjaman> daftarPeminjaman;
    
    public Perpustakaan() {
        this.koleksiBuku = new ArrayList<>();
        this.daftarAnggota = new ArrayList<>();
        this.daftarPeminjaman = new ArrayList<>();
    }
    
    public void tambahBuku(ItemPerpustakaan buku) {
        koleksiBuku.add(buku);
    }
    
    public void tambahAnggota(Anggota anggota) {
        daftarAnggota.add(anggota);
    }
    
    public Buku cariBuku(String id) throws Exception {
        for (ItemPerpustakaan item : koleksiBuku) {
            if (item instanceof Buku && item.getId().equals(id)) {
                return (Buku) item;
            }
        }
        throw new Exception("Buku dengan ID " + id + " tidak ditemukan");
    }
    
    public void buatPeminjaman(String idPeminjaman, Anggota anggota, 
                               List<String> idBuku) throws Exception {
        Peminjaman peminjaman = new Peminjaman(idPeminjaman, anggota);
        
        for (String id : idBuku) {
            Buku buku = cariBuku(id);
            if (!buku.pinjam()) {
                throw new Exception("Buku " + buku.getJudul() + 
                                  " sedang dipinjam");
            }
            peminjaman.tambahBuku(buku);
        }
        
        daftarPeminjaman.add(peminjaman);
    }
    
    public void simpanData(String namaFile) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(namaFile))) {
            oos.writeObject(this);
            System.out.println("Data berhasil disimpan ke " + namaFile);
        }
    }
    
    public static Perpustakaan muatData(String namaFile) 
            throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(namaFile))) {
            return (Perpustakaan) ois.readObject();
        }
    }
    
    public void tampilkanKoleksi() {
        System.out.println("\n=== KOLEKSI BUKU ===");
        for (ItemPerpustakaan item : koleksiBuku) {
            System.out.println(item.getInfo());
        }
    }
    
    public void tampilkanAnggota() {
        System.out.println("\n=== DAFTAR ANGGOTA ===");
        for (Anggota anggota : daftarAnggota) {
            System.out.println(anggota);
        }
    }
}