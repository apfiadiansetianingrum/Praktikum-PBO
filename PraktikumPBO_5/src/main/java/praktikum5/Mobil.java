/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ASUS
 */
public class Mobil extends Kendaraan {
    int jumlahPintu;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // panggil method dari kelas induk
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }   
}
