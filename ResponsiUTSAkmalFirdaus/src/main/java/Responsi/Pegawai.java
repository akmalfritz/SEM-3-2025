/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author MyBook Hype AMD
 */
public class Pegawai {
    // Atribut private (enkapsulasi)
    private String namaPegawai;
    private double gaji;
    
    // Constructor
    public Pegawai(String namaPegawai, double gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    
    // Getter dan Setter
    public String getNamaPegawai() {
        return namaPegawai;
    }
    
    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    
    public double getGaji() {
        return gaji;
    }
    
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    // Metode tampilkanInfo
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + namaPegawai);
        System.out.println("Gaji: " + (long)gaji);
    }
}
