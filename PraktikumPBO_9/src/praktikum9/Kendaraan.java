/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package praktikum9;

/**
 * Kelas abstrak Kendaraan
 * Merepresentasikan kendaraan secara umum
 */
abstract class Kendaraan {
    // Metode abstrak - tidak memiliki implementasi
    // Setiap kelas turunan WAJIB mengimplementasikan metode ini
    abstract void berjalan();
    
    // Metode konkret - memiliki implementasi
    // Dapat digunakan langsung oleh kelas turunan
    void info() {
        System.out.println("Ini adalah kendaraan.");
    }
}