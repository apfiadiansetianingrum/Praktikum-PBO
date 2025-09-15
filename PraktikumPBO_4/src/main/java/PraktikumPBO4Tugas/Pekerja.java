/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO4Tugas;

import PraktikumPBO4Tugas.Manusia;

/**
 *
 * @author ASUS
 */
public class Pekerja extends Manusia {
    // atribut tambahan
    private double gaji;   // private

    // constructor
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan); // panggil constructor superclass
        this.gaji = gaji;
    }

    // getter dan setter untuk gaji
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // override toString
    @Override
    public String toString() {
        return "Nama      : " + getNama() +
               "\nUsia      : " + usia +
               "\nPekerjaan : " + pekerjaan +
               "\nGaji      : " + gaji;
    }
}
