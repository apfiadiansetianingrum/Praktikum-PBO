/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11tugas;

/**
 *
 * @author ASUS
 */
public class Perpustakaan {
    private Buku[] daftarBuku;  // daftar buku menggunakan array
    private int index = 0;      // penanda posisi elemen terakhir yang terisi

    public Perpustakaan(int kapasitas) {
        daftarBuku = new Buku[kapasitas];   // komposisi: array buku 'milik' perpustakaan
    }

    public void tambahBuku(Buku buku) {
        if (index < daftarBuku.length) {
            daftarBuku[index] = buku;
            index++;
        } else {
            System.out.println("Perpustakaan penuh, tidak bisa menambah buku lagi.");
        }
    }

    public void infoPerpustakaan() {
        System.out.println("Daftar Buku di Perpustakaan");
        if (index == 0) {
            System.out.println("Belum ada buku.");
        } else {
            for (int i = 0; i < index; i++) {
                System.out.println("Buku ke-" + (i + 1));
                daftarBuku[i].infoBuku();
                System.out.println("----------------------------");
            }
        }
    }
}
