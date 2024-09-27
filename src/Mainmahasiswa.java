/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Advan
 */
import java.util.Scanner;

public class Mainmahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("NPM: ");
        String npm = input.nextLine();

        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("Nilai Kehadiran: ");
        double nilaiKehadiran = input.nextDouble();

        System.out.print("Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Nilai UTS: ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        mahasiswa mhs = new mahasiswa(npm, nama, nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS);

        System.out.println("\n--- Hasil Penilaian ---");
        System.out.println("NPM Mahasiswa: " + mhs.getNpm());
        System.out.println("Nama Mahasiswa: " + mhs.getNama());
        System.out.println("Nilai Rata-rata: " + mhs.hitungNilaiAkhir());
        System.out.println("Grade: " + mhs.tentukanGrade());
        System.out.println("Keterangan: " + mhs.tentukanKeterangan());

        input.close();
    }
}

