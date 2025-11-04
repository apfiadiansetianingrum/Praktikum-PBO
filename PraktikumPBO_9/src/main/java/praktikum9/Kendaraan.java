/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author ASUS
 */
// kelas abstrak
abstract class Kendaraan {
    // metode abstrak
    abstract void berjalan();

    // metode dengan implementasi
    void info() {
        System.out.println("Ini adalah kendaraan.");
    }
}
