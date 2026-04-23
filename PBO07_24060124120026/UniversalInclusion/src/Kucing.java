/* Nama File    : Kucing.java
 * Deskripsi    : Membuat class Kucing sebagai subclass dari Anabul dengan mengoverride method gerak dan bersuara 
                  untuk memberikan perilaku yang spesifik pada kucing. Method gerak akan menampilkan bahwa kucing 
                  bergerak dengan melata, sedangkan method bersuara akan menampilkan bahwa kucing berbunyi meong.
 * Pembuat      : Gregorius Septiano Ariadi / 24060124120026
 * Tanggal      : Kamis, 23 April 2026
 */

public class Kucing extends Anabul {

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi meong");
    }
}