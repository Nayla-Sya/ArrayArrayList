/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Nayla Syazana Aziza 2410010547
 */
public class MainTugas {
    public static void main(String[] args) {

        KelasKuliah kelas = new KelasKuliah();

        // Array mata kuliah
        String[] mataKuliah = {
            "Pemrograman Java",
            "Basis Data",
            "Struktur Data"
        };

        System.out.println("=== Daftar Mata Kuliah ===");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }

        System.out.println();

        // Tambah 5 mahasiswa
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "231001", 80));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "231002", 55));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "231003", 75));
        kelas.tambahMahasiswa(new Mahasiswa("Dina", "231004", 90));
        kelas.tambahMahasiswa(new Mahasiswa("Eko", "231005", 50));

        kelas.tampilkanSemua();

        System.out.println();
        System.out.println("Rata-rata nilai : " + kelas.hitungRataRata());
        System.out.println("Jumlah lulus    : " + kelas.jumlahLulus());

        // Tambah mahasiswa baru
        kelas.tambahMahasiswa(
            new Mahasiswa("Farhan", "231006", 85)
        );

        System.out.println();
        System.out.println("Jumlah data terbaru: "
                + kelas.jumlahMahasiswa());
    }
}
