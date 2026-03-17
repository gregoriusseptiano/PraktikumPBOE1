/* Nama File    : Main.java
 * Deskripsi    : berisi program utama untuk menggunakan class Pegawai
 * Pembuat      : Gregorius Septiano Ariadi
 * Tanggal      : Sabtu, 14 Maret 2026
 */

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== DOSEN TETAP =====");
        DosenTetap dosenTetap = new DosenTetap(
                "9545647548",
                "78647324",
                "Andi",
                LocalDate.of(1990,5,5),
                LocalDate.of(2015,1,1),
                5000000,
                "Fakultas Sains dan Matematika"
        );
        dosenTetap.printInfo();

        System.out.println("\n===== DOSEN TAMU =====");
        DosenTamu dosenTamu = new DosenTamu(
                "87654321",
                "12345678",
                "Budi",
                LocalDate.of(1985,3,10),
                LocalDate.of(2022,2,1),
                4500000,
                "Fakultas Teknik",
                LocalDate.of(2026,12,31)
        );
        dosenTamu.printInfo();

        System.out.println("\n===== TENDIK =====");
        Tendik tendik = new Tendik(
                "11223344",
                "Citra",
                LocalDate.of(1992,7,15),
                LocalDate.of(2018,4,1),
                4000000,
                "Akademik"
        );
        tendik.printInfo();
    }
}