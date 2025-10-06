/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author MyBook Hype AMD
 */
public class Produk {
     // Atribut private (enkapsulasi)
    private String namaProduk;
    private double harga;
    
    // Constructor
    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    
    // Getter dan Setter
    public String getNamaProduk() {
        return namaProduk;
    }
    
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    // Metode tampilkanInfo
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + (long)harga); // tampilkan tanpa desimal jika bilangan bulat
    }
}
