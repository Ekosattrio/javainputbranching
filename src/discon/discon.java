/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package discon;

/**
 *
 * @author Advan
 */
public class discon {
    private double totalPembelian;

    // Constructor
    public discon(double totalPembelian) {
        this.totalPembelian = totalPembelian;
    }

    public double hitungPotongan() {
        if (totalPembelian < 50000) {
            return totalPembelian * 0.05;   
        } else {
            return totalPembelian * 0.20;  }
    }

    public double hitungTotalBayar() {
        return totalPembelian - hitungPotongan();
    }

    public double getTotalPembelian() {
        return totalPembelian;
    }
}

