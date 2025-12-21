package perpustakaan.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Peminjaman implements Serializable {
    private String idPeminjaman;
    private Anggota anggota;
    private List<Buku> daftarBuku;
    
    public Peminjaman(String idPeminjaman, Anggota anggota) {
        this.idPeminjaman = idPeminjaman;
        this.anggota = anggota;
        this.daftarBuku = new ArrayList<>();
    }
    
    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }
    
    public List<Buku> getDaftarBuku() {
        return daftarBuku;
    }
    
    public Anggota getAnggota() {
        return anggota;
    }
    
    @Override
    public String toString() {
        return "Peminjaman[" + idPeminjaman + "] oleh " + 
               anggota.getNama() + " - " + daftarBuku.size() + " buku";
    }
}