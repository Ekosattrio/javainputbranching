/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imt;

/**
 *
 * @author Advan
 */
import java.util.Scanner;

public class mainimt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Berat Badan (kg): ");
        double beratBadan = input.nextDouble();

        System.out.print("Masukkan Tinggi Badan (m): ");
        double tinggiBadan = input.nextDouble();

        imt imt = new imt(beratBadan, tinggiBadan);

        double nilaiIMT = imt.hitungIMT();
        String kriteria = imt.tentukanKriteria();

        System.out.println("\n--- Hasil Perhitungan IMT ---");
        System.out.printf("Nilai IMT: %.2f\n", nilaiIMT);
        System.out.println("Kriteria: " + kriteria);

        input.close();
    }
}

