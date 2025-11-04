/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 * Main class untuk testing tugas
 */
public class MainTugas {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM SUARA HEWAN ===");
        System.out.println();
        
        // Membuat objek Kucing
        Hewan kucing = new Kucing();
        kucing.suara();
        
        // Membuat objek Anjing
        Hewan anjing = new Anjing();
        anjing.suara();
    }
}