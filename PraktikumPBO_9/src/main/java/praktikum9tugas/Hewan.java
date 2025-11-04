/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9tugas;

/**
 *
 * @author ASUS
 */
// kelas abstrak
abstract class Hewan {
    // metode abstrak
    abstract void suara();

    // metode dengan implementasi (opsional)
    void info() {
        System.out.println("Ini adalah hewan.");
    }
}
