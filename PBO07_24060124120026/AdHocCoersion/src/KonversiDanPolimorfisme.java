/* Nama File    : KonversiDanPolimorfisme.java
 * Deskripsi    : Membuat dan belajar tentang konversi tipe data dan parsing
 * Pembuat      : Gregorius Septiano Ariadi / 24060124120026
 * Tanggal      : Kamis, 23 April 2026
 */

public class KonversiDanPolimorfisme {
    public static void main(String[] args) {

        // a. Contoh konversi integer ke berbagai format
        int nilai = 65;

        // ditampilkan sebagai integer
        System.out.println("Integer: " + nilai);

        // ditampilkan sebagai karakter
        char karakter = (char) nilai;
        System.out.println("Karakter: " + karakter);

        // ditampilkan sebagai real (double)
        double real = (double) nilai;
        System.out.println("Real: " + real);

        // b. Real dikembalikan ke integer
        int kembaliKeInt = (int) real;
        System.out.println("Kembali ke Integer: " + kembaliKeInt);

        // c. String X dan Y
        String X = "1234";
        String Y = "5678";

        // konkatenasi string
        String S = X + Y;
        System.out.println("Konkatenasi S: " + S);

        // penjumlahan angka
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("Penjumlahan Z: " + Z);

        // d. String P dan Q (double)
        String P = "12.34";
        String Q = "56.78";

        // konkatenasi
        String R = P + Q;
        System.out.println("Konkatenasi R: " + R);

        // penjumlahan double
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("Penjumlahan D: " + D);

        // e. konversi S ke Integer
        int A = Integer.parseInt(S);
        System.out.println("Nilai A: " + A);

        // f. konversi A ke String
        String T = Integer.toString(A);
        System.out.println("Nilai T: " + T);
    }
}