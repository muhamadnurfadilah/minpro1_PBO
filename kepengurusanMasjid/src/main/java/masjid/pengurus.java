/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package masjid;

/**
 *
 * @author Asus
 */
public class pengurus {
    
 // Properties
    private String nama;
    private String jabatan;
    private String nomorHp;

    // Constructor
    public pengurus(String nama, String jabatan, String nomorHp) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.nomorHp = nomorHp;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getNomorHp() {
        return nomorHp;
    }

    public void setNomorHp(String nomorHp) {
        this.nomorHp = nomorHp;
    }

    // Method
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Nomor HP: " + nomorHp);
    }
    
}
