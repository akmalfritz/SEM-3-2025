/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package praktikum10;

/**
 * Class Penjumlahan mengimplementasikan interface OperasiHitung
 * untuk melakukan operasi penjumlahan
 */
public class Penjumlahan implements OperasiHitung {
    
    /**
     * Implementasi method hitung untuk operasi penjumlahan
     * @param a bilangan pertama
     * @param b bilangan kedua
     * @return hasil penjumlahan a + b
     */
    @Override
    public int hitung(int a, int b) {
        return a + b;
    }
}
