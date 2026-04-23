/* Nama File    : Anabul.java
 * Deskripsi    : Membuat class Anabul sebagai kelas dasar untuk berbagai jenis hewan peliharaan (Anabul = Anak Bulu) 
                  dengan atribut nama dan method gerak serta bersuara. Kelas ini akan menjadi parent class untuk kelas
 * Pembuat      : Gregorius Septiano Ariadi / 24060124120026
 * Tanggal      : Kamis, 23 April 2026
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
}