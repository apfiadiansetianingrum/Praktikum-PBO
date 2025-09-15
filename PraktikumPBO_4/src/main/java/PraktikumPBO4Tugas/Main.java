/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO4Tugas;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // buat objek pekerja
        Pekerja p1 = new Pekerja("Kamisato Ayaka", 25, "Programmer", 7000000);

        // tampilkan informasi dengan toString()
        System.out.println("Informasi Pekerja");
        System.out.println(p1.toString());

        // ubah nama pekerja dengan setter
        p1.setNama("Kamisato Ayato");
        System.out.println("\nSetelah Ubah Nama");
        System.out.println(p1.toString());

        // coba akses langsung atribut (nama, usia, gaji)
        // System.out.println(p1.nama);   // ERROR → nama private
        // System.out.println(p1.gaji);   // ERROR → gaji private
        System.out.println("\nUsia langsung: " + p1.usia);          // bisa, karena protected
        System.out.println("Pekerjaan langsung: " + p1.pekerjaan);  // bisa, karena public

        /*
          Penjelasan:
          - nama tidak bisa diakses langsung karena private.
          - gaji tidak bisa diakses langsung karena private.
          - usia bisa diakses di subclass/di package yang sama karena protected.
          - pekerjaan bisa diakses langsung karena public.
        */
    }
}
