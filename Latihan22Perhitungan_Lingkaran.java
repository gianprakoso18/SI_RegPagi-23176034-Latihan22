/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan22.perhitungan_lingkaran;

/**
 *
 * @author gianp
 * NAMA     : Gian Prakoso
 * KELAS    : Sistem Informasi
 * NIM      : 23176034
 */
import java.util.Scanner;
public class Latihan22Perhitungan_Lingkaran {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double diameter = 0;

        while (true) {
            System.out.println("======Perhitungan Lingkaran======");
            System.out.print("Masukkan nilai diameter lingkaran: ");
            String input = scanner.nextLine();

            try {
                diameter = Double.parseDouble(input);
                if (diameter > 0) {
                    break;
                } else {
                    System.out.println("Nilai Diameter Tidak Sesuai\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nilai Diameter Tidak Sesuai\n");
            }
        }

        double radius = diameter / 2;
        double luas = Math.PI * radius * radius;
        double keliling = Math.PI * diameter;

        System.out.println("======Hasil Perhitungan Lingkaran======");
        System.out.printf("Jari-jari Lingkaran = %.2f cm\n", radius);
        System.out.printf("Luas Lingkaran = %.2f cm\n", luas);
        System.out.printf("Keliling Lingkaran = %.2f cm\n", keliling);
    }
}