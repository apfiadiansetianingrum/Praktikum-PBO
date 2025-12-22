/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUAS;

/**
 *
 * @author ASUS
 */
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String DATA_FILE = "perpustakaan.ser";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Perpustakaan perpustakaan;

        // Load data (File I/O + Exception Handling)
        try {
            perpustakaan = Perpustakaan.muatDariFile(DATA_FILE);
            System.out.println("✅ Data berhasil dimuat dari: " + DATA_FILE);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("⚠️ Gagal memuat data. Mulai dari data kosong.");
            System.out.println("Detail: " + e.getMessage());
            perpustakaan = new Perpustakaan(null);
        }

        boolean jalan = true;
        while (jalan) {
            System.out.println("\n=== MENU PERPUSTAKAAN DIGITAL ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Semua Buku");
            System.out.println("3. Tambah Anggota");
            System.out.println("4. Lihat Semua Anggota");
            System.out.println("5. Buat Peminjaman");
            System.out.println("6. Kembalikan Peminjaman");
            System.out.println("7. Lihat Semua Peminjaman");
            System.out.println("8. Simpan & Keluar");
            System.out.print("Pilih: ");

            String pilihan = sc.nextLine();

            try {
                switch (pilihan) {
                    case "1" -> tambahBuku(sc, perpustakaan);
                    case "2" -> lihatBuku(perpustakaan);
                    case "3" -> tambahAnggota(sc, perpustakaan);
                    case "4" -> lihatAnggota(perpustakaan);
                    case "5" -> buatPeminjaman(sc, perpustakaan);
                    case "6" -> kembalikanPeminjaman(sc, perpustakaan);
                    case "7" -> lihatPeminjaman(perpustakaan);
                    case "8" -> {
                        simpan(perpustakaan);
                        jalan = false;
                    }
                    default -> System.out.println("Input menu tidak valid.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input angka tidak valid. " + e.getMessage());
            } catch (InputTidakValidException | DataTidakDitemukanException | StokTidakCukupException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Gagal akses file: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Terjadi error tak terduga: " + e.getMessage());
            }
        }

        sc.close();
        System.out.println("Program selesai.");
    }

    private static void tambahBuku(Scanner sc, Perpustakaan p) throws InputTidakValidException {
        System.out.print("ID Buku: ");
        String id = sc.nextLine().trim();
        System.out.print("Judul: ");
        String judul = sc.nextLine().trim();
        System.out.print("Tahun terbit: ");
        int tahun = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Penulis: ");
        String penulis = sc.nextLine().trim();
        System.out.print("Stok: ");
        int stok = Integer.parseInt(sc.nextLine().trim());

        Buku buku = new Buku(id, judul, tahun, penulis, stok);
        p.tambahBuku(buku);
        System.out.println("Buku ditambahkan.");
    }

    private static void lihatBuku(Perpustakaan p) {
        List<Buku> semua = p.getSemuaBuku();
        if (semua.isEmpty()) {
            System.out.println("(Kosong) Belum ada buku.");
            return;
        }
        System.out.println("DAFTAR BUKU");
        for (Buku b : semua) System.out.println(b);
    }

    private static void tambahAnggota(Scanner sc, Perpustakaan p) throws InputTidakValidException {
        System.out.print("ID Anggota: ");
        String id = sc.nextLine().trim();
        System.out.print("Nama: ");
        String nama = sc.nextLine().trim();

        p.tambahAnggota(new Anggota(id, nama));
        System.out.println("Anggota ditambahkan.");
    }

    private static void lihatAnggota(Perpustakaan p) {
        List<Anggota> semua = p.getSemuaAnggota();
        if (semua.isEmpty()) {
            System.out.println("(Kosong) Belum ada anggota.");
            return;
        }
        System.out.println("DAFTAR ANGGOTA");
        for (Anggota a : semua) System.out.println(a);
    }

    private static void buatPeminjaman(Scanner sc, Perpustakaan p) throws Exception {
        System.out.print("ID Peminjaman: ");
        String idPinjam = sc.nextLine().trim();
        System.out.print("ID Anggota: ");
        String idAnggota = sc.nextLine().trim();

        Peminjaman peminjaman = new Peminjaman(idPinjam, idAnggota);

        System.out.print("Berapa buku yang dipinjam? ");
        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 1; i <= n; i++) {
            System.out.print("ID Buku ke-" + i + ": ");
            String idBuku = sc.nextLine().trim();
            // ambil objek buku dari perpustakaan agar ID valid
            Buku buku = p.cariBuku(idBuku);
            peminjaman.tambahBuku(new Buku(buku.getId(), buku.getJudul(), buku.getTahunTerbit(), buku.getPenulis(), 0));
        }

        // simpan peminjaman dulu, lalu jalankan transaksi pinjam (interface)
        p.tambahPeminjaman(peminjaman);
        peminjaman.pinjam(p);

        System.out.println("Peminjaman berhasil dibuat: " + peminjaman);
    }

    private static void kembalikanPeminjaman(Scanner sc, Perpustakaan p) throws Exception {
        System.out.print("ID Peminjaman yang dikembalikan: ");
        String id = sc.nextLine().trim();

        Peminjaman peminjaman = p.cariPeminjaman(id);
        peminjaman.kembalikan(p);

        System.out.println("Pengembalian berhasil: " + peminjaman);
    }

    private static void lihatPeminjaman(Perpustakaan p) {
        List<Peminjaman> semua = p.getSemuaPeminjaman();
        if (semua.isEmpty()) {
            System.out.println("(Kosong) Belum ada transaksi peminjaman.");
            return;
        }
        System.out.println("DAFTAR PEMINJAMAN");
        for (Peminjaman pm : semua) System.out.println(pm);
    }

    private static void simpan(Perpustakaan p) throws IOException {
        p.simpanKeFile(DATA_FILE);
        System.out.println("Data tersimpan ke: " + DATA_FILE);
    }
}

