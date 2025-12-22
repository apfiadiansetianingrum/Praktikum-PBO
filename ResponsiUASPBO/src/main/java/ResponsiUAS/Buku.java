/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUAS;

/**
 *
 * @author ASUS
 */
public class Buku extends Koleksi {
    private static final long serialVersionUID = 1L;

    private String penulis;
    private int stok;

    public Buku(String id, String judul, int tahunTerbit, String penulis, int stok) {
        super(id, judul, tahunTerbit);
        this.penulis = penulis;
        this.stok = stok;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getStok() {
        return stok;
    }

    public void tambahStok(int jumlah) {
        if (jumlah > 0) stok += jumlah;
    }

    public void kurangiStok(int jumlah) throws StokTidakCukupException {
        if (jumlah <= 0) return;
        if (stok - jumlah < 0) {
            throw new StokTidakCukupException("Stok tidak cukup untuk buku: " + id);
        }
        stok -= jumlah;
    }

    @Override
    public String getInfo() {
        return String.format("Buku{id='%s', judul='%s', penulis='%s', tahun=%d, stok=%d}",
                id, judul, penulis, tahunTerbit, stok);
    }
}

/*Custom Exception*/
class StokTidakCukupException extends Exception {
    public StokTidakCukupException(String message) {
        super(message);
    }
}

