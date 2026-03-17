/* Nama File    : Tendik.java
 * Deskripsi    : berisi atribut dan method dalam class Tendik
 * Pembuat      : Gregorius Septiano Ariadi
 * Tanggal      : Sabtu, 14 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai {

    private String bidang;
    private int BUP = 55;

    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public LocalDate hitungTanggalPensiun() {
        LocalDate pensiun = getTanggalLahir().plusYears(BUP);
        return pensiun.plusMonths(1).withDayOfMonth(1);
    }

    public double hitungTunjangan() {
        int masaKerja = hitungMasaKerja().getYears();
        return 0.01 * masaKerja * getGajiPokok();
    }

    @Override
    public void printInfo() {
        Period masaKerja = hitungMasaKerja();
        System.out.println("NIP : " + getNip());
        System.out.println("Nama : " + getNama());
        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang : " + bidang);
        System.out.println("Masa Kerja : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + hitungTanggalPensiun());
        System.out.println("Tunjangan : Rp " + hitungTunjangan());
    }
}
