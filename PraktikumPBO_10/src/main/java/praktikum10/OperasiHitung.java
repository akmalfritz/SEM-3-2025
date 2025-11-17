/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package praktikum10;

/**
 * Interface yang mendefinisikan kontrak untuk operasi hitung
 * Setiap class yang mengimplementasikan interface ini
 * wajib menyediakan implementasi method hitung()
 */
public interface OperasiHitung {
    /**
     * Method untuk melakukan operasi hitung
     * @param a operand pertama
     * @param b operand kedua
     * @return hasil operasi hitung
     */
    int hitung(int a, int b);
}