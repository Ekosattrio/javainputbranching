/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package discon;

/**
 *
 * @author Advan
 */
import java.util.Scanner;

public class maindiscon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Total pembelian Rp.: ");
        double totalPembelian = input.nextDouble();

        discon pembelian = new discon(totalPembelian);

        double potongan = pembelian.hitungPotongan();
        double totalBayar = pembelian.hitungTotalBayar();

        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.println("Total pembelian Rp.: " + totalPembelian);
        System.out.println("Besarnya potongan Rp.: " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp.: " + totalBayar);

        input.close();
    }
}

