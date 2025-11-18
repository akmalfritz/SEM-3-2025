package praktikum11;

public class Pengarang {
    // Atribut private
    private String namaPengarang;
    private String negara;
    
    // Constructor
    public Pengarang(String namaPengarang, String negara) {
        this.namaPengarang = namaPengarang;
        this.negara = negara;
    }
    
    // Method untuk menampilkan info pengarang
    public void infoPengarang() {
        System.out.println("Pengarang: " + namaPengarang);
        System.out.println("Negara: " + negara);
    }
    
    // Getter methods
    public String getNamaPengarang() {
        return namaPengarang;
    }
    
    public String getNegara() {
        return negara;
    }
}