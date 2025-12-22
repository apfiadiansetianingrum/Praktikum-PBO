/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUAS;

/**
 *
 * @author ASUS
 */
import java.io.*;
import java.util.*;

public class Perpustakaan {
    private LibraryData data;

    public Perpustakaan(LibraryData data) {
        this.data = (data == null) ? new LibraryData() : data;
    }

    /* AGREGASI: Perpustakaan "memiliki" daftar Anggota (bisa ada tanpa perpustakaan tertentu) */

    // Buku
    public void tambahBuku(Buku buku) throws InputTidakValidException {
        if (buku == null) throw new InputTidakValidException("Buku tidak boleh null.");
        if (buku.getId() == null || buku.getId().isBlank()) throw new InputTidakValidException("ID buku wajib diisi.");
        data.getBukuMap().put(buku.getId(), buku);
    }

    public Buku cariBuku(String idBuku) throws DataTidakDitemukanException {
        Buku b = data.getBukuMap().get(idBuku);
        if (b == null) throw new DataTidakDitemukanException("Buku tidak ditemukan: " + idBuku);
        return b;
    }

    public List<Buku> getSemuaBuku() {
        return new ArrayList<>(data.getBukuMap().values());
    }

    // Anggota
    public void tambahAnggota(Anggota anggota) throws InputTidakValidException {
        if (anggota == null) throw new InputTidakValidException("Anggota tidak boleh null.");
        if (anggota.getIdAnggota() == null || anggota.getIdAnggota().isBlank())
            throw new InputTidakValidException("ID anggota wajib diisi.");
        data.getAnggotaMap().put(anggota.getIdAnggota(), anggota);
    }

    public boolean cekAnggotaAda(String idAnggota) {
        return data.getAnggotaMap().containsKey(idAnggota);
    }

    public List<Anggota> getSemuaAnggota() {
        return new ArrayList<>(data.getAnggotaMap().values());
    }

    // Peminjaman
    public void tambahPeminjaman(Peminjaman peminjaman) throws InputTidakValidException {
        if (peminjaman == null) throw new InputTidakValidException("Peminjaman tidak boleh null.");
        if (peminjaman.getIdPeminjaman() == null || peminjaman.getIdPeminjaman().isBlank())
            throw new InputTidakValidException("ID peminjaman wajib diisi.");
        data.getPeminjamanMap().put(peminjaman.getIdPeminjaman(), peminjaman);
    }

    public Peminjaman cariPeminjaman(String idPeminjaman) throws DataTidakDitemukanException {
        Peminjaman p = data.getPeminjamanMap().get(idPeminjaman);
        if (p == null) throw new DataTidakDitemukanException("Peminjaman tidak ditemukan: " + idPeminjaman);
        return p;
    }

    public List<Peminjaman> getSemuaPeminjaman() {
        return new ArrayList<>(data.getPeminjamanMap().values());
    }

    // File I/O + Serialisasi
    public void simpanKeFile(String path) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(data);
        }
    }

    public static Perpustakaan muatDariFile(String path) throws IOException, ClassNotFoundException {
        File f = new File(path);
        if (!f.exists()) {
            // kalau file belum ada, mulai dari data kosong
            return new Perpustakaan(new LibraryData());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            LibraryData loaded = (LibraryData) ois.readObject();
            return new Perpustakaan(loaded);
        }
    }
}

/* Custom Exception */
class InputTidakValidException extends Exception {
    public InputTidakValidException(String message) {
        super(message);
    }
}
