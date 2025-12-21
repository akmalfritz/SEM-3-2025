package perpustakaan.model;

public class Buku extends ItemPerpustakaan implements Pinjamable {
    private String pengarang;
    private boolean dipinjam;
    
    public Buku(String id, String judul, String pengarang) {
        super(id, judul);
        this.pengarang = pengarang;
        this.dipinjam = false;
    }
    
    @Override
    public String getInfo() {
        return "Buku: " + judul + " oleh " + pengarang + 
               " [" + (dipinjam ? "Dipinjam" : "Tersedia") + "]";
    }
    
    @Override
    public boolean pinjam() {
        if (!dipinjam) {
            dipinjam = true;
            return true;
        }
        return false;
    }
    
    @Override
    public boolean kembalikan() {
        if (dipinjam) {
            dipinjam = false;
            return true;
        }
        return false;
    }
    
    @Override
    public boolean isDipinjam() {
        return dipinjam;
    }
    
    public String getPengarang() { return pengarang; }
}