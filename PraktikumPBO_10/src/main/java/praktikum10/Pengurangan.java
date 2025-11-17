/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package praktikum10;

/**
 * Class Pengurangan mengimplementasikan interface OperasiHitung
 * untuk melakukan operasi pengurangan
 */
public class Pengurangan implements OperasiHitung {
    
    /**
     * Implementasi method hitung untuk operasi pengurangan
     * @param a bilangan pertama
     * @param b bilangan kedua
     * @return hasil pengurangan a - b
     */
    @Override
    public int hitung(int a, int b) {
        return a - b;
    }
}