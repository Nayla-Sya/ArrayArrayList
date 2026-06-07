/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian3.perpustakaan;

import java.util.ArrayList;

/**
 *
 * @author Nayla Syazana Aziza 2410010547
 */
public class Perpustakaan {
    // ArrayList yang menampung objek bertipe Buku
 private ArrayList<Buku> koleksi = new ArrayList<>();
 // Menambah satu buku ke koleksi
 public void tambahBuku(Buku buku) {
 koleksi.add(buku);
 }
 // Menampilkan seluruh koleksi beserta nomor urut
 public void tampilkanKoleksi() {
 System.out.println("== Koleksi Perpustakaan ==");
 for (int i = 0; i < koleksi.size(); i++) {
 Buku b = koleksi.get(i);
 System.out.println((i + 1) + ". " + b.info());
 }
 }
 // Mencari buku berdasarkan judul, lalu menandainya dipinjam
 public void pinjamBuku(String judul) {
 for (Buku b : koleksi) {
 if (b.getJudul().equals(judul)) {
 if (b.isDipinjam()) {
 System.out.println(judul + " sedang dipinjam.");
 } else {
 b.setDipinjam(true);
 System.out.println(judul + " berhasil dipinjam.");
 }
 return;
 }
 }
 System.out.println("Buku " + judul + " tidak ditemukan.");
 }
 
 // Mengembalikan buku
public void kembalikanBuku(String judul) {
    for (Buku b : koleksi) {
        if (b.getJudul().equals(judul)) {
            b.setDipinjam(false);
            System.out.println(judul + " berhasil dikembalikan.");
            return;
        }
    }
    System.out.println("Buku " + judul + " tidak ditemukan.");
}

// Mencari buku berdasarkan penulis
public void cariPenulis(String penulis) {
    boolean ditemukan = false;

    System.out.println("Buku karya " + penulis + ":");

    for (Buku b : koleksi) {
        if (b.getPenulis().equalsIgnoreCase(penulis)) {
            System.out.println("- " + b.info());
            ditemukan = true;
        }
    }

    if (!ditemukan) {
        System.out.println("Tidak ada buku karya " + penulis);
    }
}


 // Menghitung jumlah buku yang masih tersedia
 public int jumlahTersedia() {
 int jumlah = 0;
 for (Buku b : koleksi) {
 if (!b.isDipinjam()) {
 jumlah++;
 }
 }
 return jumlah;
 }
}
