/* Nama File    : MBangunDatar.java
 * Deskripsi    : berisi program utama untuk menggunakan class BangunDatar
 * Pembuat      : Gregorius Septiano Ariadi
 * Tanggal      : Kamis, 12 Maret 2026
 */

public class MBangunDatar {
    public static void main(String[] args) {
        System.out.println("===== PERSEGI =====");
        Persegi persegi = new Persegi();
        persegi.setJmlSisi(4);
        persegi.setPersegi(5, "Biru", "Tebal");
        System.out.println("Luas Persegi : " + persegi.getLuas());
        System.out.println("Keliling Persegi : " + persegi.getKeliling());
        System.out.println("Diagonal Persegi : " + persegi.getDiagonal());
        System.out.println("Informasi Persegi : ");
        System.out.println("================================");
        persegi.printInfo();



        System.out.println("\n ===== LINGKARAN =====");
        Lingkaran lingkaran = new Lingkaran(10, "Merah", "Merah", "Tebal");
        System.out.println("Luas Lingkaran : " + lingkaran.getLuas());
        System.out.println("Keliling Lingkaran : " + lingkaran.getKeliling());
        System.out.println("Diagonal Lingkaran : " + lingkaran.Diagonal());
        System.out.println("Informasi Lingkaran : ");
        System.out.println("================================");
        lingkaran.printInfo();
    }
} 