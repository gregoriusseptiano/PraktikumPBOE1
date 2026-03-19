/* Nama File    : IResize.java
 * Deskripsi    : Membuat interface IResize untuk mengubah ukuran bangun datar
 * Pembuat      : Gregorius Septiano Ariadi / 24060124120026
 * Tanggal      : Kamis, 19 Maret 2026
 */

public interface IResize {
    //menambah ukuran sebesar 10%
    public void zoomIn();

    //mengurangi ukuran sebesar 10%
    public void zoomOut();

    //menambah ukuran sebesar persentase tertentu
    public void zoom(int percent);
}