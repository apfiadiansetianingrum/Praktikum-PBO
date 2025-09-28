/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6tugas;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        // contoh produk
        Buku buku1 = new Buku("Pemrograman Java", 150_000, "Andi");
        Buku buku2 = new Buku("Novel Ringan", 80_000, "Siti");
        Elektronik hp = new Elektronik("Smartphone X", 2_500_000, 24);
        Pakaian kaos = new Pakaian("Kaos Polos", 120_000, "M");

        // tambahkan ke keranjang
        keranjang.tambahProduk(buku1);
        keranjang.tambahProduk(buku2);
        keranjang.tambahProduk(hp);
        keranjang.tambahProduk(kaos);

        // cetak rincian dan total
        keranjang.printRincian();
    }
}
