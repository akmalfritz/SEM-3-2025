package praktikum12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class Buku yang dapat diserialisasi
class Buku implements Serializable {
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }
    
    @Override
    public String toString() {
        return "Judul: " + judul + ", Pengarang: " + pengarang + 
               ", Tahun: " + tahunTerbit;
    }
    
    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
}

public class SistemPerpustakaan {
    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.ser";
    private static List<Buku> bukuList = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== Sistem Manajemen Perpustakaan ===");
            System.out.println("1. Tambah Buku Baru");
            System.out.println("2. Simpan ke File Teks (buku.txt)");
            System.out.println("3. Simpan Objek ke File Serial (buku.ser)");
            System.out.println("4. Tampilkan Buku dari File Teks");
            System.out.println("5. Tampilkan Buku dari File Serial");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihan) {
                case 1 -> tambahBuku(scanner);
                case 2 -> simpanKeFileTeks();
                case 3 -> simpanKeFileSerial();
                case 4 -> bacaDariFileTeks();
                case 5 -> bacaDariFileSerial();
                case 6 -> {
                    System.out.println("Terima kasih telah menggunakan sistem.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }
    
    private static void tambahBuku(Scanner scanner) {
        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan nama pengarang: ");
        String pengarang = scanner.nextLine();
        System.out.print("Masukkan tahun terbit: ");
        int tahun = scanner.nextInt();
        
        bukuList.add(new Buku(judul, pengarang, tahun));
        System.out.println("Buku berhasil ditambahkan ke dalam daftar.");
    }
    
    private static void simpanKeFileTeks() {
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(TEXT_FILE))) {
            for (Buku buku : bukuList) {
                writer.write(buku.toString());
                writer.newLine();
            }
            System.out.println("Data buku berhasil disimpan ke " + TEXT_FILE);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file teks.");
            e.printStackTrace();
        }
    }
    
    private static void simpanKeFileSerial() {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(bukuList);
            System.out.println("Objek buku berhasil disimpan ke " + SERIAL_FILE);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat serialisasi.");
            e.printStackTrace();
        }
    }
    
    private static void bacaDariFileTeks() {
        try (BufferedReader reader = new BufferedReader(
                new FileReader(TEXT_FILE))) {
            System.out.println("\n=== Daftar Buku dari " + TEXT_FILE + " ===");
            String line;
            int nomor = 1;
            while ((line = reader.readLine()) != null) {
                System.out.println(nomor + ". " + line);
                nomor++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan. Silakan simpan data terlebih dahulu.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file.");
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    private static void bacaDariFileSerial() {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(SERIAL_FILE))) {
            List<Buku> deserializedList = (List<Buku>) ois.readObject();
            System.out.println("\n=== Daftar Buku dari " + SERIAL_FILE + " ===");
            int nomor = 1;
            for (Buku buku : deserializedList) {
                System.out.println(nomor + ". ");
                buku.tampilkanInfo();
                System.out.println("---");
                nomor++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan. Silakan simpan data terlebih dahulu.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Terjadi kesalahan saat deserialisasi.");
            e.printStackTrace();
        }
    }
}