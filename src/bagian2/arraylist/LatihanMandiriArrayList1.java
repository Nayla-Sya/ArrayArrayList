/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.arraylist;

import java.util.ArrayList;

/**
 *
 * @author Nayla Syazana Aziza 2410010547
 */
public class LatihanMandiriArrayList1 {
    public static void main(String[] args) {

        ArrayList<String> daftarBelanja = new ArrayList<>();

        daftarBelanja.add("Beras");
        daftarBelanja.add("Gula");
        daftarBelanja.add("Minyak");
        daftarBelanja.add("Telur");

        // Hapus item ke-2 (indeks 1)
        daftarBelanja.remove(1);

        System.out.println("Isi daftar belanja:");
        for (String item : daftarBelanja) {
            System.out.println(item);
        }

        System.out.println("Jumlah item akhir: " + daftarBelanja.size());
    }
}
