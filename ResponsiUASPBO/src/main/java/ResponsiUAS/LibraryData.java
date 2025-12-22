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
import java.util.HashMap;
import java.util.Map;

public class LibraryData implements Serializable {
    private static final long serialVersionUID = 1L;

    // Koleksi & Generics
    private Map<String, Buku> bukuMap = new HashMap<>();
    private Map<String, Anggota> anggotaMap = new HashMap<>();
    private Map<String, Peminjaman> peminjamanMap = new HashMap<>();

    public Map<String, Buku> getBukuMap() {
        return bukuMap;
    }

    public Map<String, Anggota> getAnggotaMap() {
        return anggotaMap;
    }

    public Map<String, Peminjaman> getPeminjamanMap() {
        return peminjamanMap;
    }
}

