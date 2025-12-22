/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11tugas;

/**
 *
 * @author ASUS
 */
public class Buku {
    private String judul;
    private Pengarang pengarang;   // agregasi: Buku 'memiliki' Pengarang

    public Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public void infoBuku() {
        System.out.println("Judul   : " + judul);
        if (pengarang != null) {
            pengarang.infoPengarang();   // memanggil infoPengarang() milik objek Pengarang
        } else {
            System.out.println("Pengarang : -");
        }
    }
}
