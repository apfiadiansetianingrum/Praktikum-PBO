/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3tugas;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Camry", 2023, "Hitam");
        mobil1.setWarna("Putih");
        mobil1.displayInfo();
        mobil1.startEngine();
        
        Mobil mobil2 = new Mobil("Honda", "CR-V", 2024, "Merah");
        mobil2.setWarna("Silver");
        mobil2.displayInfo();
        mobil2.startEngine();
    }
}