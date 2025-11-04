/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 * Kelas Mobil - turunan dari Kendaraan
 * Mengimplementasikan metode abstrak berjalan()
 */
class Mobil extends Kendaraan {
    // Override metode abstrak dari kelas parent
    @Override
    void berjalan() {
        System.out.println("Mobil sedang berjalan dengan cepat.");
    }
}