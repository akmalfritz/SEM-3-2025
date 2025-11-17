/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package praktikum10;

/**
 * Interface Pembayaran untuk sistem pembayaran toko
 * Mendefinisikan kontrak untuk menghitung pajak produk
 */
public interface Pembayaran {
    /**
     * Method untuk menghitung pajak produk
     * @param harga harga produk sebelum pajak
     * @return total harga setelah pajak
     */
    double hitungPajak(double harga);
}
