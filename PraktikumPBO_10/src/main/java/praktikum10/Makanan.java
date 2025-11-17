/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package praktikum10;

/**
 * Class Makanan untuk produk makanan
 * Pajak yang dikenakan: 5%
 */
public class Makanan implements Pembayaran {
    
    private static final double PAJAK = 0.05; // 5%
    
    /**
     * Menghitung total harga makanan setelah pajak 5%
     * @param harga harga produk sebelum pajak
     * @return total harga setelah pajak
     */
    @Override
    public double hitungPajak(double harga) {
        double totalPajak = harga * PAJAK;
        double totalHarga = harga + totalPajak;
        
        System.out.println("Harga Produk Makanan: Rp " + harga);
        System.out.println("Pajak (5%): Rp " + totalPajak);
        System.out.println("Total Pembayaran: Rp " + totalHarga);
        
        return totalHarga;
    }
}