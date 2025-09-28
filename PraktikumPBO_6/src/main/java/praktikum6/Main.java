/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Polimorfisme runtime
        Hewan hewan = new Kucing();
        hewan.bersuara();   // Output: Meow

        // Objek kucing
        Kucing kucing = new Kucing();
        kucing.makan("ikan");         // Memanggil metode makan() dari kelas Hewan
        kucing.makan("ikan", 2);      // Memanggil metode makan() yang overloaded

        // Objek anjing
        Anjing anjing = new Anjing();
        anjing.bersuara();            // Output: Woof
        anjing.makan("daging", 3);    // Memanggil metode makan() yang overloaded
    }
}
