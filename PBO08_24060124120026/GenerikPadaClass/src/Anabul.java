/* Nama File    : Anabul.java
 * Deskripsi    : Membuat class Anabul sebagai kelas dasar untuk berbagai jenis hewan peliharaan (Anabul = Anak Bulu) 
                  dengan atribut nama dan method gerak serta bersuara. Kelas ini akan menjadi parent class untuk kelas Anjing dan Burung
 * Pembuat      : Gregorius Septiano Ariadi / 24060124120026
 * Tanggal      : Kamis, 30 April 2026
 */

public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
    return nama;
    }
    
    public abstract void gerak();
    public abstract void bersuara();

    // default (hewan lain tidak punya info tambahan)
    public void infoTambahan() {
        // kosong
    }
}
