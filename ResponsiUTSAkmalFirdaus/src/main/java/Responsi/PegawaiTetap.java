/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author MyBook Hype AMD
 */
public class PegawaiTetap extends Pegawai {
    private double tunjangan;
    
    public PegawaiTetap(String namaPegawai, double gaji, double tunjangan) {
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }
    
    // Getter dan Setter
    public double getTunjangan() {
        return tunjangan;
    }
    
    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }
    
    // Override metode tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tunjangan: " + (long)tunjangan);
    }
}
    