/* Nama File    : MAnabul.java
 * Deskripsi    : Membuat class Main untuk menguji konsep polimorfisme universal inclusion dengan membuat array dari 
                  tipe Anabul yang berisi objek-objek dari kelas Kucing, Anjing, dan Burung. Kemudian, menggunakan loop 
                  untuk memanggil method gerak dan bersuara pada setiap objek dalam array, sehingga menunjukkan perilaku 
                  yang berbeda sesuai dengan jenis hewan peliharaan yang diwakili oleh masing-masing objek.
 * Pembuat      : Gregorius Septiano Ariadi / 24060124120026
 * Tanggal      : Kamis, 30 April 2026
 */

public class MAnabul {
    public static void main(String[] args) {

        Kucing k1 = new Anggora("Milo", 3.5);
        Kucing k2 = new KembangTelon("Luna", 4.2);
        Anjing a1 = new Anjing("Doggy");
        Burung b1 = new Burung("Tweety");

        Datum<Anabul> d1 = new Datum<>(k1);
        Datum<Anabul> d2 = new Datum<>(k2);
        Datum<Anabul> d3 = new Datum<>(a1);
        Datum<Anabul> d4 = new Datum<>(b1);

        Anabul x;

        x = d1.getIsi();
        System.out.println("Nama: " + x.getNama());
        x.gerak();
        x.bersuara();
        x.infoTambahan();
        System.out.println();

        x = d2.getIsi();
        System.out.println("Nama: " + x.getNama());
        x.gerak();
        x.bersuara();
        x.infoTambahan();
        System.out.println();

        x = d3.getIsi();
        System.out.println("Nama: " + x.getNama());
        x.gerak();
        x.bersuara();
        x.infoTambahan();
        System.out.println();

        x = d4.getIsi();
        System.out.println("Nama: " + x.getNama());
        x.gerak();
        x.bersuara();
        x.infoTambahan();
        System.out.println();
    }
}