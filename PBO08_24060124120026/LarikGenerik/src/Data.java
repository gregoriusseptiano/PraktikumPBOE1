/* Nama File    : Data.java
 * Deskripsi    : Membuat class Data sebagai generic class untuk menyimpan elemen-elemen dengan tipe data yang spesifik.
 * Pembuat      : Gregorius Septiano Ariadi / 24060124120026
 * Tanggal      : Kamis, 30 April 2026
 */

public class Data<T> {
    private T[] ruang;
    private int banyak;

    @SuppressWarnings("unchecked")
    public Data() {
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    // set isi 
    public void setIsi(int posisi, T nilai) {
        ruang[posisi - 1] = nilai;
        banyak = Math.max(banyak, posisi);
    }

    // get isi 
    public T getIsi(int posisi) {
        return ruang[posisi - 1];
    }

    // get size
    public int getSize() {
        return banyak;
    }
}