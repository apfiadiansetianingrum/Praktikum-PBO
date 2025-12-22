/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // COMPOSITION (Perpustakaan → Buku)
        Perpustakaan p = new Perpustakaan();
        p.tambahBuku(new Buku("Pemrograman Java"));
        p.tambahBuku(new Buku("Struktur Data"));
        p.tambahBuku(new Buku("Algoritma dan Pemrograman"));

        System.out.println("Data Perpustakaan");
        p.infoPerpustakaan();

        // AGGREGATION (Klub → Anggota)
        Klub klub = new Klub("Klub Basket");

        Anggota a1 = new Anggota("Ayato");
        Anggota a2 = new Anggota("Ayaya");
        Anggota a3 = new Anggota("Kaveh");

        klub.tambahAnggota(a1);
        klub.tambahAnggota(a2);
        klub.tambahAnggota(a3);

        System.out.println("\nData Klub");
        klub.infoKlub();
    }
}
