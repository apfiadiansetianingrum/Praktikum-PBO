/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6tugas;

import java.util.ArrayList;
import java.util.List;

/**
 * Menyimpan list Produk dan menghitung total harga setelah diskon
 */
public class KeranjangBelanja {
    private List<Produk> items;

    public KeranjangBelanja() {
        items = new ArrayList<>();
    }

    public void tambahProduk(Produk p) {
        items.add(p);
    }

    public List<Produk> getItems() {
        return items;
    }

    public double totalSebelumDiskon() {
        return items.stream().mapToDouble(Produk::getHarga).sum();
    }

    public double totalDiskon() {
        return items.stream().mapToDouble(Produk::hitungDiskon).sum();
    }

    public double totalSetelahDiskon() {
        return totalSebelumDiskon() - totalDiskon();
    }

    public void printRincian() {
        System.out.println("===== RINCIAN KERANJANG =====");
        for (Produk p : items) {
            System.out.println(p.toString());
        }
        System.out.println("----------------------------");
        System.out.printf("Total sebelum diskon : Rp %, .0f\n", totalSebelumDiskon());
        System.out.printf("Total diskon         : Rp %, .0f\n", totalDiskon());
        System.out.printf("Total setelah diskon : Rp %, .0f\n", totalSetelahDiskon());
    } 
}
