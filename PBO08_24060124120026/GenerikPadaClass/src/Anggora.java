/* Nama File    : Anggora.java
 * Deskripsi    : Membuat class Anggora sebagai subclass dari Kucing dengan mengoverride method bersuara untuk memberikan perilaku 
                  yang spesifik pada kucing Anggora. Method bersuara akan menampilkan bahwa kucing Anggora berbunyi meong lembut.
 * Pembuat      : Gregorius Septiano Ariadi / 24060124120026
 * Tanggal      : Kamis, 30 April 2026
 */

public class Anggora extends Kucing {

    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " (Anggora) berbunyi meong lembut");
    }
}