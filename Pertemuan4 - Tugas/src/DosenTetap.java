/* Nama File    : DosenTetap.java
 * Deskripsi    : berisi atribut dan method dalam class DosenTetap
 * Pembuat      : Gregorius Septiano Ariadi
 * Tanggal      : Sabtu, 14 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen {

    private String nidn;
    private int BUP = 65;

    public DosenTetap(String nip, String nidn, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public LocalDate hitungTanggalPensiun() {
        LocalDate pensiun = getTanggalLahir().plusYears(BUP);
        return pensiun.plusMonths(1).withDayOfMonth(1);
    }

    public double hitungTunjangan() {
        int masaKerja = hitungMasaKerja().getYears();
        return 0.02 * masaKerja * getGajiPokok();
    }

    @Override
    public void printInfo() {
        Period masaKerja = hitungMasaKerja();
        System.out.println("NIP : " + getNip());
        System.out.println("NIDN : " + nidn);
        System.out.println("Nama : " + getNama());
        System.out.println("Tanggal Lahir : " + getTanggalLahir());
        System.out.println("TMT : " + getTmt());
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas : " + getFakultas());
        System.out.println("Masa Kerja : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + hitungTanggalPensiun());
        System.out.println("Gaji Pokok : Rp " + getGajiPokok());
        System.out.println("Tunjangan : Rp " + hitungTunjangan());
    }
}