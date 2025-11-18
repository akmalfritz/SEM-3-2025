package praktikum11;

public class Buku {
    // Atribut private untuk enkapsulasi
    private String judul;
    private String isbn;
    
    // Constructor untuk inisialisasi objek
    public Buku(String judul, String isbn) {
        this.judul = judul;
        this.isbn = isbn;
    }
    
    // Method untuk menampilkan informasi buku
    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
        System.out.println("ISBN: " + isbn);
    }
    
    // Getter untuk mengakses atribut judul
    public String getJudul() {
        return judul;
    }
    
    // Getter untuk mengakses atribut isbn
    public String getIsbn() {
        return isbn;
    }
}