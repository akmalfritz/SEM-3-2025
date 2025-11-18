package praktikum11;

public class BukuLengkap {
    // Atribut
    private String judul;
    private String isbn;
    private Pengarang pengarang; // AGREGASI dengan Pengarang
    
    // Constructor
    public BukuLengkap(String judul, String isbn, Pengarang pengarang) {
        this.judul = judul;
        this.isbn = isbn;
        this.pengarang = pengarang; // Menerima objek Pengarang yang sudah ada
    }
    
    // Method untuk menampilkan info buku lengkap dengan pengarang
    public void infoBuku() {
        System.out.println("Judul: " + judul);
        System.out.println("ISBN: " + isbn);
        pengarang.infoPengarang(); // Memanggil method dari objek Pengarang
    }
    
    // Getter methods
    public String getJudul() {
        return judul;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public Pengarang getPengarang() {
        return pengarang;
    }
}