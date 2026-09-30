/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum4;

/**
 *
 * @author HP
 */
public class MainAset {
    public static void main(String[] args) {

        ManajemenAset manajemen = new ManajemenAset();

        manajemen.tambahAset(
            new AsetIT("A001", "Server", "Ruang Server", "Baik")
        );

        manajemen.tambahAset(
            new AsetIT("A002", "Router", "Ruang Jaringan", "Baik")
        );

        manajemen.tambahAset(
            new AsetIT("A003", "Switch", "Ruang Jaringan", "Rusak")
        );

        manajemen.tambahAset(
            new AsetIT("A004", "PC", "Laboratorium Komputer", "Baik")
        );

        System.out.println("=== DATA SELURUH ASET ===");
        manajemen.tampilkanSemuaAset();

        System.out.println("\n=== PROSES PENGHAPUSAN ===");
        manajemen.hapusAset("A003");

        System.out.println("\n=== DATA ASET SETELAH PENGHAPUSAN ===");
        manajemen.tampilkanSemuaAset();
    }
}
