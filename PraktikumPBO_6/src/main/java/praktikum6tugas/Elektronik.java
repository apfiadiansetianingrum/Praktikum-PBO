/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6tugas;

/**
 * Kelas Elektronik (turunan Produk)
 * Kebijakan diskon Elektronik:
 * - Jika harga > 1_000_000 -> diskon 12%
 * - Jika harga <= 1_000_000 -> diskon 8%
 * (ilustrasi: barang elektronik biasanya diskon variatif tergantung harga)
 */
public class Elektronik extends Produk {
    private int masaGaransiBulan;

    public Elektronik(String nama, double harga, int masaGaransiBulan) {
        super(nama, harga);
        this.masaGaransiBulan = masaGaransiBulan;
    }

    public int getMasaGaransiBulan() {
        return masaGaransiBulan;
    }

    @Override
    public double hitungDiskon() {
        if (harga > 1_000_000) {
            return harga * 0.12;
        } else {
            return harga * 0.08;
        }
    } 
}
