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

public abstract class Koleksi implements Serializable {
    private static final long serialVersionUID = 1L;

    protected String id;
    protected String judul;
    protected int tahunTerbit;

    public Koleksi(String id, String judul, int tahunTerbit) {
        this.id = id;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public String getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // METHOD ABSTRACT
    public abstract String getInfo();

    @Override
    public String toString() {
        return getInfo();
    }
}

