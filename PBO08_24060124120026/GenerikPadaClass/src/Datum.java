/* Nama File    : Datum.java
 * Deskripsi    : Membuat class Datum sebagai generic class yang dapat menyimpan nilai dengan tipe data apa pun.
 * Pembuat      : Gregorius Septiano Ariadi / 24060124120026
 * Tanggal      : Kamis, 30 April 2026
 */

public class Datum<T> {
    private T isi;

    public Datum(T isi) {
        this.isi = isi;
    }

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isiBaru) {
        this.isi = isiBaru;
    }
}