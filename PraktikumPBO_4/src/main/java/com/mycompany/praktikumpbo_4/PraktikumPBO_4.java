/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumpbo_4;

import praktikum4.Kendaraan;
import praktikum4.Mobil;

/**
 *
 * @author ASUS
 */
public class PraktikumPBO_4 {

    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Kendaraan("Sepeda Motor", 120, "Bensin");
        System.out.println("Informasi Kendaraan");
        kendaraan1.tampilkanInfoKendaraan();
        System.out.println();

        Mobil mobil1 = new Mobil("Toyota", 200, "Bensin", 4);
        System.out.println("Informasi Mobil");
        mobil1.tampilkanInfoMobil();
        System.out.println();
    }
}
