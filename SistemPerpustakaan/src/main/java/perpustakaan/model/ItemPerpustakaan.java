package perpustakaan.model;
import java.io.Serializable;

public abstract class ItemPerpustakaan implements Serializable {
    protected String id;
    protected String judul;
    
    public ItemPerpustakaan(String id, String judul) {
        this.id = id;
        this.judul = judul;
    }
    
    public abstract String getInfo();
    
    public String getId() { return id; }
    public String getJudul() { return judul; }
}