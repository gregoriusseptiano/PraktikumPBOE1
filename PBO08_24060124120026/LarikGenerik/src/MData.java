/* Nama File    : MData.java
 * Deskripsi    : Membuat class MData sebagai class utama untuk menguji fungsi dari class Data.
 * Pembuat      : Gregorius Septiano Ariadi / 24060124120026
 * Tanggal      : Kamis, 30 April 2026
 */

public class MData {
    public static void main(String[] args) {

        Data<Anabul> data = new Data<>();

        data.setIsi(1, new Anggora("Milo", 3.5));
        data.setIsi(2, new KembangTelon("Luna", 4.2));
        data.setIsi(3, new Anjing("Doggy"));
        data.setIsi(4, new Burung("Tweety"));

        Anabul a;

        a = data.getIsi(1);
        System.out.println("Data ke-1:");
        a.gerak();
        a.bersuara();
        a.infoTambahan();
        System.out.println();

        a = data.getIsi(2);
        System.out.println("Data ke-2:");
        a.gerak();
        a.bersuara();
        a.infoTambahan();
        System.out.println();

        a = data.getIsi(3);
        System.out.println("Data ke-3:");
        a.gerak();
        a.bersuara();
        a.infoTambahan();
        System.out.println();

        a = data.getIsi(4);
        System.out.println("Data ke-4:");
        a.gerak();
        a.bersuara();
        a.infoTambahan();
        System.out.println();

        System.out.println("Jumlah elemen: " + data.getSize());
    }
}