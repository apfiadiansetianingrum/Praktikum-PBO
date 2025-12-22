/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prakitkum12tugas;

/**
 *
 * @author ASUS
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrarySystem {

    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.ser";
    private static List<Buku> bukuList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Buku (simpan ke buku.txt)");
            System.out.println("2. Simpan Objek Buku ke buku.ser");
            System.out.println("3. Tampilkan Buku dari buku.txt");
            System.out.println("4. Tampilkan Buku dari buku.ser");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // konsumsi newline

            switch (pilihan) {
                case 1 -> tambahBuku(scanner);
                case 2 -> simpanKeFileSerial();
                case 3 -> bacaDariFileTeks();
                case 4 -> bacaDariFileSerial();
                case 5 -> {
                    System.out.println("Program selesai.");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private static void tambahBuku(Scanner scanner) {
        System.out.print("Judul buku: ");
        String judul = scanner.nextLine();

        System.out.print("Pengarang: ");
        String pengarang = scanner.nextLine();

        System.out.print("Tahun terbit: ");
        int tahun = scanner.nextInt();

        Buku buku = new Buku(judul, pengarang, tahun);
        bukuList.add(buku);

        // Simpan ke file teks
        try (FileWriter writer = new FileWriter(TEXT_FILE, true)) {
            writer.write(buku.toString() + "\n");
            System.out.println("Buku berhasil disimpan ke buku.txt");
        } catch (IOException e) {
            System.out.println("Kesalahan menyimpan ke buku.txt");
        }
    }

    private static void simpanKeFileSerial() {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(bukuList);
            System.out.println("Daftar buku berhasil diserialisasi ke buku.ser");
        } catch (IOException e) {
            System.out.println("Kesalahan saat menyimpan ke buku.ser");
        }
    }

    private static void bacaDariFileTeks() {
        System.out.println("\nIsi file buku.txt:");
        try (BufferedReader reader = new BufferedReader(new FileReader(TEXT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File buku.txt belum ada atau tidak bisa dibaca.");
        }
    }

    private static void bacaDariFileSerial() {
        System.out.println("\nDaftar buku dari buku.ser:");
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(SERIAL_FILE))) {
            List<Buku> list = (List<Buku>) ois.readObject();

            for (Buku buku : list) {
                buku.tampilkanInfo();
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Kesalahan membaca buku.ser");
        }
    }
}

