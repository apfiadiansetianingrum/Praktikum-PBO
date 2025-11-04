/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author ASUS
 */
// kelas utama untuk pengujian
public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();

        mobil.berjalan();
        mobil.info();

        sepeda.berjalan();
        sepeda.info();

        // Nomor 4: Cobalah membuat objek dari kelas abstrak Kendaraan
        // Kendaraan kendaraanBaru = new Kendaraan(); // Error!

        System.out.println("\nPercobaan membuat objek dari kelas abstrak:");
        System.out.println("Tidak bisa membuat objek langsung dari kelas abstrak Kendaraan.");
        System.out.println("Karena kelas abstrak hanya berfungsi sebagai template bagi kelas turunannya.");
    }
}
