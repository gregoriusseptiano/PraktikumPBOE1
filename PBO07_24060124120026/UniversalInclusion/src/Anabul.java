/* Nama File    : Anabul.java
 * Deskripsi    : Membuat class Anabul sebagai kelas dasar untuk berbagai jenis hewan peliharaan (Anabul = Anak Bulan) 
                  dengan atribut nama dan method gerak serta bersuara. Kelas ini akan menjadi parent class untuk kelas
 * Pembuat      : Gregorius Septiano Ariadi / 24060124120026
 * Tanggal      : Kamis, 23 April 2026
 */

public class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public void gerak() {
        System.out.println("Anabul bergerak");
    }

    public void bersuara() {
        System.out.println("Anabul bersuara");
    }
}