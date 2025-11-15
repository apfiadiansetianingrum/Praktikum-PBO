/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10tugas;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Objek Elektronik
        Pembayaran elektronik = new Elektronik();
        double hargaElektronik = 2000000; // contoh harga
        System.out.println("Harga Elektronik : " + hargaElektronik);
        System.out.println("Pajak Elektronik : " + elektronik.hitungPajak(hargaElektronik));
        System.out.println("-----------------------------------");
        // Objek Makanan
        Pembayaran makanan = new Makanan();
        double hargaMakanan = 50000; // contoh harga
        System.out.println("Harga Makanan    : " + hargaMakanan);
        System.out.println("Pajak Makanan    : " + makanan.hitungPajak(hargaMakanan));
    }
}
