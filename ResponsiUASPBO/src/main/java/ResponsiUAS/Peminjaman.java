/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUAS;

/**
 *
 * @author ASUS
 */
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Peminjaman implements ITransaksi, Serializable {
    private static final long serialVersionUID = 1L;

    private String idPeminjaman;
    private String idAnggota; // disimpan sebagai ID agar simple & tetap konsisten saat serialisasi
    private LocalDate tanggalPinjam;
    private LocalDate tanggalKembali; // null jika belum kembali

    // KOMPOSISI: Peminjaman "memiliki" daftar Buku
    private List<Buku> daftarBuku = new ArrayList<>();

    public Peminjaman(String idPeminjaman, String idAnggota) {
        this.idPeminjaman = idPeminjaman;
        this.idAnggota = idAnggota;
        this.tanggalPinjam = LocalDate.now();
    }

    public String getIdPeminjaman() {
        return idPeminjaman;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public LocalDate getTanggalPinjam() {
        return tanggalPinjam;
    }

    public LocalDate getTanggalKembali() {
        return tanggalKembali;
    }

    public boolean isSelesai() {
        return tanggalKembali != null;
    }

    public List<Buku> getDaftarBuku() {
        return daftarBuku;
    }

    public void tambahBuku(Buku buku) {
        if (buku != null) daftarBuku.add(buku);
    }

    @Override
    public void pinjam(Perpustakaan perpustakaan) throws Exception {
        if (perpustakaan == null) throw new IllegalArgumentException("Perpustakaan null");

        // validasi anggota
        if (!perpustakaan.cekAnggotaAda(idAnggota)) {
            throw new DataTidakDitemukanException("Anggota tidak ditemukan: " + idAnggota);
        }

        // kurangi stok untuk setiap buku yang dipinjam
        for (Buku b : daftarBuku) {
            Buku bukuDiPerpus = perpustakaan.cariBuku(b.getId());
            bukuDiPerpus.kurangiStok(1);
        }
    }

    @Override
    public void kembalikan(Perpustakaan perpustakaan) throws Exception {
        if (perpustakaan == null) throw new IllegalArgumentException("Perpustakaan null");
        if (isSelesai()) throw new IllegalStateException("Peminjaman sudah selesai.");

        // tambah stok kembali
        for (Buku b : daftarBuku) {
            Buku bukuDiPerpus = perpustakaan.cariBuku(b.getId());
            bukuDiPerpus.tambahStok(1);
        }

        tanggalKembali = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Peminjaman{" +
                "id='" + idPeminjaman + '\'' +
                ", idAnggota='" + idAnggota + '\'' +
                ", pinjam=" + tanggalPinjam +
                ", kembali=" + tanggalKembali +
                ", jumlahBuku=" + daftarBuku.size() +
                '}';
    }
}

/* Custom Exception*/
class DataTidakDitemukanException extends Exception {
    public DataTidakDitemukanException(String message) {
        super(message);
    }
}

