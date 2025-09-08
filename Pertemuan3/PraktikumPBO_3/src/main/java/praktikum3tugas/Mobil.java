/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3tugas;

/**
 *
 * @author ASUS
 */
public class Mobil {
    private String merk;
    private String model;
    private int tahun;
    private String warna;
    
    public Mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getTahun() {
        return tahun;
    }
    public void setTahunk(int tahun) {
        this.tahun = tahun;
    }
     public String getWarna() {
        return warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    void displayInfo() {
        System.out.println("Mobil berwarna "+getWarna()+" dengan merk "+getMerk()+" dan model "+getModel()+" ini keluaran tahun "+getTahun()+".");
    }
    void startEngine() {
        System.out.println("Mesin mobil "+getMerk()+" menyala.");
    }
}