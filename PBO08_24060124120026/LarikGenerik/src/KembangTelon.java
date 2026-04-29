/* Nama File    : KembangTelon.java
 * Deskripsi    : Membuat class KembangTelon sebagai subclass dari Kucing dengan mengoverride method bersuara untuk memberikan perilaku 
                  yang spesifik pada kucing KembangTelon. Method bersuara akan menampilkan bahwa kucing KembangTelon berbunyi meong khas.
 * Pembuat      : Gregorius Septiano Ariadi / 24060124120026
 * Tanggal      : Kamis, 30 April 2026
 */

public class KembangTelon extends Kucing {

    public KembangTelon(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " (KembangTelon) berbunyi meong khas");
    }
}