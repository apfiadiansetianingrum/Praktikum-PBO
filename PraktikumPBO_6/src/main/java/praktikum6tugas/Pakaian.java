/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6tugas;

/**
 * Kelas Pakaian (turunan Produk)
 * Kebijakan diskon Pakaian:
 * - Diskon flat 15% untuk ilustrasi
 * - (Bisa diubah sesuai logika: seasonal, ukuran, stok, dll.)
 */
public class Pakaian extends Produk {
    private String ukuran; // S, M, L, XL

    public Pakaian(String nama, double harga, String ukuran) {
        super(nama, harga);
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    @Override
    public double hitungDiskon() {
        return harga * 0.15;
    }  
}
