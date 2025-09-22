/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5tugas;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {

        // Objek Hewan
        Kucing kucing = new Kucing();
        kucing.nama = "Kitty";
        kucing.jenis = "Mamalia";
        kucing.tampilkanInfo();

        System.out.println("-------------------");

        Anjing anjing = new Anjing();
        anjing.nama = "Doggo";
        anjing.jenis = "Mamalia";
        anjing.tampilkanInfo();

        System.out.println("===================");

        // Objek Kendaraan
        Mobil mobil = new Mobil();
        mobil.nama = "Toyota";
        mobil.kecepatan = 180;
        mobil.jumlahRoda = 4;
        mobil.jumlahPintu = 4;
        mobil.tampilkanInfo();

        System.out.println("-------------------");

        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Yamaha";
        motor.kecepatan = 120;
        motor.jumlahRoda = 2;
        motor.jenisMesin = "2-tak";
        motor.tampilkanInfo();
    }   
}
