/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum4;

import java.util.ArrayList;
import java.util.Iterator;

public class ManajemenAset {
    private ArrayList<AsetIT> daftarAset;

    public ManajemenAset() {
        daftarAset = new ArrayList<>();
    }

    public void tambahAset(AsetIT asetbaru) {
        daftarAset.add(asetbaru);
    }

    public void tampilkanSemuaAset() {
        if (daftarAset.isEmpty()) {
            System.out.println("Tidak ada data aset.");
            return;
        }

        for (AsetIT aset : daftarAset) {
            aset.tampilkanInfoAset();
        }
    }

    public void hapusAset(String idAset) {
        Iterator<AsetIT> iterator = daftarAset.iterator();

        while (iterator.hasNext()) {
            AsetIT aset = iterator.next();

            if (aset.getIdAset().equals(idAset)) {
                iterator.remove();
                System.out.println("Aset dengan ID " + idAset + " berhasil dihapus.");
                return;
            }
        }

        System.out.println("Aset dengan ID " + idAset + " tidak ditemukan.");
    }
}