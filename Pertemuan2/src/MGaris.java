/* Nama File    : MGaris.java
 * Deskripsi    : berisi program utama untuk menggunakan class Garis
 * Pembuat      : Gregorius Septiano Ariadi
 * Tanggal      : Jumat, 27 Februari 2026
 */

public class MGaris {
    public static void main(String[] args) {

        /*************** MEMBUAT OBJEK ***************/
        Titik A = new Titik(-2, 0);
        Titik B = new Titik(0, 4);
        Garis G1 = new Garis(A, B);

        Titik C = new Titik(0, 0);
        Titik D = new Titik(2, 4);
        Garis G2 = new Garis(C, D);

        /*************** MENGUJI GETTER ***************/
        System.out.println("Titik Awal G1:");
        G1.getTitikAwal().printTitik();

        System.out.println("Titik Akhir G1:");
        G1.getTitikAkhir().printTitik();

        /*************** MENGUJI PANJANG ***************/
        System.out.println("Panjang G1 = " + G1.getPanjang());

        /*************** MENGUJI GRADIEN ***************/
        System.out.println("Gradien G1 = " + G1.getGradien());

        /*************** MENGUJI TITIK TENGAH ***************/
        Titik tengah = G1.getTitikTengah();
        System.out.println("Titik Tengah G1:");
        tengah.printTitik();

        /*************** MENGUJI KESEJAJARAN ***************/
        System.out.println("Apakah G1 sejajar G2? " + G1.isSejajar(G2));

        /*************** MENGUJI TEGAK LURUS ***************/
        System.out.println("Apakah G1 tegak lurus G2? " + G1.isTegakLurus(G2));

        /*************** MENGUJI PRINT GARIS ***************/
        System.out.println("Data G1:");
        G1.printGaris();

        /*************** MENGUJI PERSAMAAN GARIS ***************/
        System.out.println("Persamaan G1: " + G1.getPersamaanGaris());

        /*************** MENGUJI COUNTER ***************/
        System.out.println("Jumlah objek Garis = " + Garis.getCounterGaris());

        /*************** MENGUJI KONSTRUKTOR TANPA PARAMETER ***************/
        Garis G3 = new Garis();
        System.out.println("Data G3 (default):");
        G3.printGaris();

        /*************** MENGUJI SETTER ***************/
        Titik E = new Titik(5, 5);
        G3.setTitikAwal(E);
        System.out.println("Setelah setTitikAwal G3:");
        G3.printGaris();

        Titik F = new Titik(10, 10);
        G3.setTitikAkhir(F);
        System.out.println("Setelah setTitikAkhir G3:");
        G3.printGaris();

    }
}
