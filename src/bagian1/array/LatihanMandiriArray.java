/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian1.array;

/**
 *
 * @author Nayla
 */
public class LatihanMandiriArray {
    public static void main(String[] args) {
        double[] suhu = {30.5, 28.7, 31.2, 29.8, 32.1, 27.9};

        double tertinggi = suhu[0];
        double terendah = suhu[0];

        for (int i = 1; i < suhu.length; i++) {
            if (suhu[i] > tertinggi) {
                tertinggi = suhu[i];
            }

            if (suhu[i] < terendah) {
                terendah = suhu[i];
            }
        }

        System.out.println("Suhu tertinggi = " + tertinggi);
        System.out.println("Suhu terendah = " + terendah);
    }
}
