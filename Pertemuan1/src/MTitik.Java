/* Nama File    : MTitik.java
 * Deskripsi    : berisi program utama untuk menggunakan class Titik
 * Pembuat      : Gregorius Septiano Ariadi
 * Tanggal      : Kamis, 19 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); // Membuat objek titik T1 (0,0)
        T1.setAbsis(3);       // mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4);     // mengubah ordinat T1 dengan nilai 4
        T1.printTitik();        // mencetak koordinat T1 ke layar
        T1.geser(3,4);     // menggeser T1 sejauh (3,4)
        T1.printTitik();        // menampilkan koordinat T1 setelah digeser

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik();      // Membuat objek titik T1 (0,0)
        Titik T4 = new Titik(3,5);   // Membuat objek titik T2 (3,5)

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        // System.out.println("Jumlah Objek Titik = " + T2.getCounterTitik());
        // T2.printCounterTitik();
        
        T3.printTitik();
        T4.printTitik();

        // Menguji method getAbsis() dan getOrdinat()
        System.out.println("Absis T4 = " + T4.getAbsis());
        System.out.println("Ordinat T4 = " + T4.getOrdinat());
        
        // getKuadran
        System.out.println("Kuadran T4 = " + T4.getKuadran());

        // getJarakPusat
        System.out.println("Jarak T4 ke pusat = " + T4.getJarakPusat());

        // getJarak antar titik
        System.out.println("Jarak T4 ke T1 = " + T4.getJarak(T1));

        // refleksiX (mengubah objek)
        T4.refleksiX();
        System.out.println("T4 setelah refleksi sumbu X:");
        T4.printTitik();

        // refleksiY (mengubah objek)
        T4.refleksiY();
        System.out.println("T4 setelah refleksi sumbu Y:");
        T4.printTitik();

        // getRefleksiX (objek baru)
        Titik RX = T4.getRefleksiX();
        System.out.println("Hasil getRefleksiX:");
        RX.printTitik();

        // getRefleksiY (objek baru)
        Titik RY = T4.getRefleksiY();
        System.out.println("Hasil getRefleksiY:");
        RY.printTitik();

    }
}

