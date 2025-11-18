package praktikum11;

public class Anggota {
    // Atribut private
    private String nama;
    private String nomorAnggota;
    
    // Constructor
    public Anggota(String nama, String nomorAnggota) {
        this.nama = nama;
        this.nomorAnggota = nomorAnggota;
    }
    
    // Method untuk menampilkan info anggota
    public void infoAnggota() {
        System.out.println("Nama: " + nama);
        System.out.println("Nomor Anggota: " + nomorAnggota);
    }
    
    // Getter methods
    public String getNama() {
        return nama;
    }
    
    public String getNomorAnggota() {
        return nomorAnggota;
    }
}