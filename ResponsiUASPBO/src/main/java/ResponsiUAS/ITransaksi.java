/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ResponsiUAS;

/**
 *
 * @author ASUS
 */
public interface ITransaksi {
    void pinjam(Perpustakaan perpustakaan) throws Exception;
    void kembalikan(Perpustakaan perpustakaan) throws Exception;
}

