/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9tugas;

/**
 *
 * @author ASUS
 */
// kelas utama untuk pengujian
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();

        kucing.suara();
        anjing.suara();
        
        // Hewan hewanBaru = new Hewan(); // Error

        // Percobaan membuat objek dari kelas abstrak
        System.out.println("\nPercobaan membuat objek dari kelas abstrak:");
        System.out.println("Tidak bisa membuat objek langsung dari kelas abstrak Hewan.");
        System.out.println("Karena kelas abstrak hanya berfungsi sebagai template bagi kelas turunannya.");
    }
}
