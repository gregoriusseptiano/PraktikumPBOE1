/* Nama File    : Main.java
 * Deskripsi    : Membuat class Main untuk menguji konsep polimorfisme universal inclusion dengan membuat array dari 
                  tipe Anabul yang berisi objek-objek dari kelas Kucing, Anjing, dan Burung. Kemudian, menggunakan loop 
                  untuk memanggil method gerak dan bersuara pada setiap objek dalam array, sehingga menunjukkan perilaku 
                  yang berbeda sesuai dengan jenis hewan peliharaan yang diwakili oleh masing-masing objek.
 * Pembuat      : Gregorius Septiano Ariadi / 24060124120026
 * Tanggal      : Kamis, 23 April 2026
 */

public class MAnabul {
    public static void main(String[] args) {

        // Polimorfisme: tipe Anabul, objek beda-beda
        Anabul[] hewan = {
            new Kucing("Kitty"),
            new Anjing("Doggy"),
            new Burung("Tweety")
        };

        for (Anabul a : hewan) {
            a.gerak();
            a.bersuara();
            System.out.println();
        }
    }
}