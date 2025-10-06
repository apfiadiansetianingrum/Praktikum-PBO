/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsipbo;

/**
 *
 * @author ASUS
 */
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // ===== Output Produk =====
        System.out.println("Output Produk:");
        Elektronik produk1 = new Elektronik("Smart TV Samsung", 8400000, 3);
        produk1.tampilkanInfo();

        // ===== Output Pegawai =====
        System.out.println("\nOutput Pegawai:");
        PegawaiTetap pegawai1 = new PegawaiTetap("Apfia", 6200000, 1250000);
        pegawai1.tampilkanInfo();

        // ===== Output Polimorfisme =====
        System.out.println("\nOutput Polimorfisme:");
        Produk produk2 = new Makanan("Roti Coklat", 18000, LocalDate.of(2025, 5, 10));
        Pegawai pegawai2 = new PegawaiKontrak("Apfia", 3200000, 10);

        produk2.tampilkanInfo();
        System.out.println();
        pegawai2.tampilkanInfo();
    }  
}
