/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11tugas;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {

        // Pengarang dibuat dulu (bisa hidup tanpa buku)
        Pengarang pengarang1 = new Pengarang("Tere Liye");
        Pengarang pengarang2 = new Pengarang("Andrea Hirata");

        // Buku dibuat dengan 'meminjam' pengarang (agregasi)
        Buku buku1 = new Buku("Bumi", pengarang1);
        Buku buku2 = new Buku("Laskar Pelangi", pengarang2);
        // contoh agregasi kuat: satu pengarang bisa dipakai banyak buku
        Buku buku3 = new Buku("Bulan", pengarang1);

        // Perpustakaan dibuat dengan kapasitas 5 buku (komposisi)
        Perpustakaan perpustakaan = new Perpustakaan(5);
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        // Tampilkan semua buku di perpustakaan
        perpustakaan.infoPerpustakaan();
    }
}
