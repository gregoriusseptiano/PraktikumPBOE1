/* Nama File    : MMahasiswa.java
 * Deskripsi    : membuat aplikasi untuk menguji konstruktor dan method overloading pada class Mahasiswa. 
                  Terdapat 3 konstruktor dan 3 method setProgramStudi yang berbeda parameter. Juga terdapat method tampil 
                  untuk menampilkan informasi mahasiswa.
 * Pembuat      : Gregorius Septiano Ariadi / 24060124120026
 * Tanggal      : Kamis, 23 April 2026
 */

public class MMahasiswa {
    public static void main(String[] args) {

        // c. Konstruktor tanpa parameter
        Mahasiswa m1 = new Mahasiswa();
        System.out.println("Objek m1 (default):");
        m1.tampil();

        // d. Konstruktor 3 parameter
        Mahasiswa m2 = new Mahasiswa("120026", "Gregorius Septiano Ariadi", "Informatika");
        System.out.println("Objek m2 (parameter):");
        m2.tampil();

        // e. Copy constructor (clone)
        Mahasiswa m3 = new Mahasiswa(m2);
        System.out.println("Objek m3 (clone dari m2):");
        m3.tampil();

        // b. Uji semua varian setProgramStudi

        // varian 1 (tanpa parameter)
        m1.setProgramStudi();
        System.out.println("Set tanpa parameter:");
        m1.tampil();

        // varian 2 (String)
        m1.setProgramStudi("Sistem Informasi");
        System.out.println("Set dengan String:");
        m1.tampil();

        // varian 3 (objek)
        m1.setProgramStudi(m2);
        System.out.println("Set dengan objek Mahasiswa:");
        m1.tampil();
    }
} 