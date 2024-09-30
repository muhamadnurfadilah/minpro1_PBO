# PBO Manajemen Kepengurusan Masjid
Program ini di rancang bertujuan untuk mempermudah proses pengelolaan manajemen kepengurusan di sebuah masjid.
Di dalam program ini terdapat operasi CRUD (Create, Read, Update, Delete) yang akan membantu pengelolaan data kepengurusan.

## Fitur Program
- Tambah Pengurus: Menambahkan pengurus baru ke dalam kepengurusan masjid.
- Lihat Pengurus: Menampilkan daftar kepengurusan masjid yang tersedia.
- Update Pengurus: Mengubah status jabatan kepengurusan dan juga nomor hp.
- Hapus Pengurus: Menghapus data pengurus dari daftar kepengurusan masjid.
- Keluar: Menyelesaikan/menghentikan program.

## Struktur Program
Pada program ini, terbagi menjadi dua package (`masjid` dan `main`) dan dua class (`Pengurus` dan `ManajemenPengurus`).Berikut adalah struktur folder dari proyek ini:

### Kelas `Pengurus`
Kelas `Pengurus` berfungsi untuk merepresentasikan entitas pengurus masjid. Kelas ini memiliki tiga properti dan satu method yang berfungsi menampilkan data pengurus.

#### Properti:
- `String nama`: Nama pengurus.
- `String jabatan`: Jabatan pengurus di masjid.
- `String nomorHp`: Nomor telepon pengurus.

#### Constructor:
```java
public Pengurus(String nama, String jabatan, String nomorHp)
```
Method:
- public void tampilkanData(): Method ini digunakan untuk menampilkan informasi pengurus, seperti nama, jabatan, dan nomor telepon.

#### Kelas ManajemenPengurus
Kelas ini berfungsi sebagai kelas utama yang menyediakan antarmuka pengguna berbasis teks (CLI) untuk mengelola data pengurus masjid. Fitur CRUD (Create, Read, Update, Delete) diimplementasikan dalam kelas ini.

#### Properti:
- static ArrayList<Pengurus> listPengurus: ArrayList ini menyimpan daftar objek pengurus.
- static Scanner scanner: Scanner ini digunakan untuk membaca input dari pengguna.

Method:
- public static void tambahPengurus(): Method ini digunakan untuk menambahkan pengurus baru ke dalam daftar.
- public static void lihatPengurus(): Method ini digunakan untuk menampilkan daftar pengurus yang sudah ada.
- public static void updatePengurus(): Method ini digunakan untuk memperbarui data pengurus berdasarkan nama yang diinput oleh pengguna.
- public static void hapusPengurus(): Method ini digunakan untuk menghapus pengurus dari daftar berdasarkan nama.

#### Tipe Data yang Digunakan:
1. String: Digunakan untuk menyimpan nama, jabatan, dan nomor telepon pengurus.
2. ArrayList: Digunakan untuk menyimpan daftar objek Pengurus. Tipe data ini digunakan karena mendukung penambahan dan penghapusan data secara dinamis.
3. boolean: Digunakan sebagai flag untuk memastikan apakah pengurus dengan nama tertentu ditemukan atau tidak saat pencarian data (misalnya saat update atau hapus pengurus).
4. Scanner: Digunakan untuk menerima input dari pengguna dalam bentuk teks (String) dan angka (int).

#### Alur Program:
1. Program akan menampilkan menu utama kepada pengguna, yang berisi pilihan untuk menambah, melihat, memperbarui, menghapus, atau keluar dari program.
2. Pengguna memilih salah satu opsi.
3. Berdasarkan pilihan pengguna:
      - Jika menambah pengurus, pengguna akan diminta untuk memasukkan nama, jabatan, dan nomor telepon pengurus.
      - Jika melihat daftar pengurus, program akan menampilkan daftar pengurus yang tersimpan di ArrayList.
      - Jika mengupdate pengurus, pengguna diminta memasukkan nama pengurus yang ingin diubah, lalu diminta data baru untuk diperbarui.
      - Jika menghapus pengurus, pengguna diminta memasukkan nama pengurus yang ingin dihapus.
Setelah setiap operasi, program akan kembali ke menu utama hingga pengguna memilih untuk keluar.

