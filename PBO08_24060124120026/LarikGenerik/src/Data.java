/* Nama File    : Data.java
 * Deskripsi    : Membuat class Data sebagai generic class untuk menyimpan elemen-elemen dengan tipe data yang spesifik.
 * Pembuat      : Gregorius Septiano Ariadi / 24060124120026
 * Tanggal      : Kamis, 30 April 2026
 */

public class Data<T> {
    private static Object[] ruang = new Object[100];
    private static int banyak = 0;

    // set isi 
    public void setIsi(int posisi, T nilai) {
        ruang[posisi - 1] = nilai;
        banyak = Math.max(banyak, posisi);
    }

    // get isi 
    @SuppressWarnings("unchecked")
    public T getIsi(int posisi) {
        return (T) ruang[posisi - 1];
    }

    // get size
    public int getSize() {
        return banyak;
    }
}