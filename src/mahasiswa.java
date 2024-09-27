/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Advan
 */
public class mahasiswa {
    private String npm;
    private String nama;
    private double nilaiKehadiran;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;

    public mahasiswa(String npm, String nama, double nilaiKehadiran, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.npm = npm;
        this.nama = nama;
        this.nilaiKehadiran = nilaiKehadiran;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public double hitungNilaiAkhir() {
        return (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }

    public String tentukanGrade() {
        double nilaiAkhir = hitungNilaiAkhir();
        if (nilaiAkhir >= 76 && nilaiAkhir <= 100) {
            return "A";
        } else if (nilaiAkhir >= 66 && nilaiAkhir <= 75) {
            return "B";
        } else if (nilaiAkhir >= 56 && nilaiAkhir <= 65) {
            return "C";
        } else if (nilaiAkhir >= 46 && nilaiAkhir <= 55) {
            return "D";
        } else {
            return "E";
        }
    }

    public String tentukanKeterangan() {
        String grade = tentukanGrade();
        switch (grade) {
            case "A":
                return "ISTIMEWA";
            case "B":
                return "BAIK";
            case "C":
                return "CUKUP";
            case "D":
                return "KURANG";
            default:
                return "KURANG SEKALI";
        }
    }

    public String getNpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }
}

