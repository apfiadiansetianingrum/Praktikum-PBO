/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6tugas;

/**
 * Kelas Buku (turunan Produk)
 * Kebijakan diskon untuk Buku:
 * - Jika harga >= 100000 -> diskon 10%
 * - Jika harga < 100000  -> diskon 5%
 */
public class Buku extends Produk {
    private String penulis;

    public Buku(String nama, double harga, String penulis) {
        super(nama, harga);
        this.penulis = penulis;
    }

    public String getPenulis() {
        return penulis;
    }

    @Override
    public double hitungDiskon() {
        if (harga >= 100_000) {
            return harga * 0.10;
        } else {
            return harga * 0.05;
        }
    }
}
