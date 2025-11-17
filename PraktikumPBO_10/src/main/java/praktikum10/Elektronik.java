/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package praktikum10;

/**
 * Class Elektronik untuk produk elektronik
 * Pajak yang dikenakan: 10%
 */
public class Elektronik implements Pembayaran {
    
    private static final double PAJAK = 0.10; // 10%
    
    /**
     * Menghitung total harga elektronik setelah pajak 10%
     * @param harga harga produk sebelum pajak
     * @return total harga setelah pajak
     */
    @Override
    public double hitungPajak(double harga) {
        double totalPajak = harga * PAJAK;
        double totalHarga = harga + totalPajak;
        
        System.out.println("Harga Produk Elektronik: Rp " + harga);
        System.out.println("Pajak (10%): Rp " + totalPajak);
        System.out.println("Total Pembayaran: Rp " + totalHarga);
        
        return totalHarga;
    }
}