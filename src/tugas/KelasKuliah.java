/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

import java.util.ArrayList;

/**
 *
 * @author Nayla
 */
public class KelasKuliah {

    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    public double hitungRataRata() {
        double total = 0;

        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }

        return total / daftarMahasiswa.size();
    }

    public int jumlahLulus() {
        int jumlah = 0;

        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) {
                jumlah++;
            }
        }

        return jumlah;
    }

    public void tampilkanSemua() {
        System.out.println("=== Data Mahasiswa ===");

        for (Mahasiswa m : daftarMahasiswa) {
            String status = m.lulus() ? "Lulus" : "Tidak Lulus";

            System.out.println(
                m.getNama() + " | " +
                m.getNpm() + " | Nilai: " +
                m.getNilai() + " | " + status
            );
        }
    }

    public int jumlahMahasiswa() {
        return daftarMahasiswa.size();
    }
}
