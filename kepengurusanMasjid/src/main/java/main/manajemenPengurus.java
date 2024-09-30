/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import masjid.pengurus;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class manajemenPengurus {
    
// Static ArrayList untuk menyimpan data pengurus
    static ArrayList<pengurus> listpengurus = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        
        while (running) {
            System.out.println("=== Menu Manajemen pengurus Masjid ===");
            System.out.println("1. Tambah pengurus");
            System.out.println("2. Lihat pengurus");
            System.out.println("3. Update pengurus");
            System.out.println("4. Hapus pengurus");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Konsumsi newline

            switch   (pilihan) {
                case 1:
                    tambahpengurus();
                    break;
                case 2:
                    lihatpengurus();
                    break;
                case 3:
                    updatepengurus();
                    break;
                case 4:
                    hapuspengurus();
                    break;
                case 5:
                    running = false;
                    System.out.println("Keluar dari sistem.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    // Tambah pengurus baru
    public static void tambahpengurus() {
        System.out.print("Masukkan Nama pengurus: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jabatan: ");
        String jabatan = scanner.nextLine();
        System.out.print("Masukkan Nomor HP: ");
        String nomorHp = scanner.nextLine();

        pengurus pengurusBaru = new pengurus(nama, jabatan, nomorHp);
        listpengurus.add(pengurusBaru);
        System.out.println("pengurus berhasil ditambahkan!\n");
    }

    // Lihat daftar pengurus
    public static void lihatpengurus() {
        if (listpengurus.isEmpty()) {
            System.out.println("Tidak ada pengurus terdaftar.\n");
        } else {
            System.out.println("=== Daftar pengurus ===");
            for (pengurus pengurus : listpengurus) {
                pengurus.tampilkanData();
                System.out.println();
            }
        }
    }

    // Update pengurus berdasarkan nama
    public static void updatepengurus() {
        System.out.print("Masukkan nama pengurus yang ingin di-update: ");
        String nama = scanner.nextLine();
        boolean found = false;

        for (pengurus pengurus : listpengurus) {
            if (pengurus.getNama().equalsIgnoreCase(nama)) {
                System.out.print("Masukkan Jabatan baru: ");
                String jabatanBaru = scanner.nextLine();
                System.out.print("Masukkan Nomor HP baru: ");
                String nomorHpBaru = scanner.nextLine();
                
                pengurus.setJabatan(jabatanBaru);
                pengurus.setNomorHp(nomorHpBaru);
                System.out.println("Data pengurus berhasil di-update!\n");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("pengurus dengan nama tersebut tidak ditemukan.\n");
        }
    }

    // Hapus pengurus berdasarkan nama
    public static void hapuspengurus() {
        System.out.print("Masukkan nama pengurus yang ingin dihapus: ");
        String nama = scanner.nextLine();
        boolean found = false;

        for (pengurus pengurus : listpengurus) {
            if (pengurus.getNama().equalsIgnoreCase(nama)) {
                listpengurus.remove(pengurus);
                System.out.println("pengurus berhasil dihapus!\n");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("pengurus dengan nama tersebut tidak ditemukan.\n");
        }
    }
    
}
