/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 * Main class untuk pengujian
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Mobil dengan tipe Kendaraan (Polymorphism)
        Kendaraan mobil = new Mobil();
        
        // Membuat objek Sepeda dengan tipe Kendaraan (Polymorphism)
        Kendaraan sepeda = new Sepeda();
        
        // Memanggil metode berjalan() dari Mobil
        mobil.berjalan();
        
        // Memanggil metode info() yang diwarisi dari Kendaraan
        mobil.info();
        
        System.out.println(); // Baris kosong untuk pemisah
        
        // Memanggil metode berjalan() dari Sepeda
        sepeda.berjalan();
        
        // Memanggil metode info() yang diwarisi dari Kendaraan
        sepeda.info();
    }
}