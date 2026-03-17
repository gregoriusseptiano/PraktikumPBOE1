/* Nama File    : DosenTamu.java
 * Deskripsi    : berisi atribut dan method dalam class DosenTamu
 * Pembuat      : Gregorius Septiano Ariadi
 * Tanggal      : Sabtu, 14 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen {

    private String nidk;
    private LocalDate tanggalAkhirKontrak;

    public DosenTamu(String nip, String nidk, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, LocalDate tanggalAkhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    public double hitungTunjangan() {
        return 0.025 * getGajiPokok();
    }

    public Period sisaKontrak() {
        return Period.between(LocalDate.now(), tanggalAkhirKontrak);
    }

    @Override
    public void printInfo() {

        System.out.println("NIP : " + getNip());
        System.out.println("NIDK : " + nidk);
        System.out.println("Nama : " + getNama());
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + getFakultas());
        System.out.println("Sisa Kontrak : " + sisaKontrak().getMonths() + " bulan");
        System.out.println("Tunjangan : Rp " + hitungTunjangan());
    }
}