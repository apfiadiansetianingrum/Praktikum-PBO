/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6tugas;

/**
 *
 * @author ASUS
 */
public abstract class Produk {
    protected String nama;
    protected double harga; // dalam satuan rupiah

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    /**
     * Metode abstrak yang harus dioverride di tiap turunan.
     * Metode ini mengembalikan besaran diskon (dalam rupiah).
     */
    public abstract double hitungDiskon();

    /**
     * Harga setelah diskon
     */
    public double hargaSetelahDiskon() {
        return harga - hitungDiskon();
    }

    @Override
    public String toString() {
        return String.format("%s - Harga: Rp %, .0f | Diskon: Rp %, .0f | Setelah diskon: Rp %, .0f",
                nama, harga, hitungDiskon(), hargaSetelahDiskon()).replaceAll(", ", ",");
    }   
}
