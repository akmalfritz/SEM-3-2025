package perpustakaan.model;

public interface Pinjamable {
    boolean pinjam();
    boolean kembalikan();
    boolean isDipinjam();
}