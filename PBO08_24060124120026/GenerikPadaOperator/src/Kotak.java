/* Nama File    : Kotak.java
 * Deskripsi    : Membuat class Kotak sebagai generic class yang dapat menyimpan data dengan tipe tertentu.
 * Pembuat      : Gregorius Septiano Ariadi / 24060124120026
 * Tanggal      : Kamis, 30 April 2026
 */

public class Kotak<T> {
    T isi;

    public Kotak(T isi) {
        this.isi = isi;
    }

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isi) {
        this.isi = isi;
    }
}