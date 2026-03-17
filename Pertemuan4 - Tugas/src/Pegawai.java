/* Nama File    : Pegawai.java
 * Deskripsi    : berisi atribut dan method dalam class Pegawai
 * Pembuat      : Gregorius Septiano Ariadi
 * Tanggal      : Sabtu, 14 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Pegawai {

    private String nip;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate tmt;
    private double gajiPokok;

    public Pegawai(){

    }

    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok){
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public String getNip() {
        return this.nip;
    }

    public String getNama() {
        return this.nama;
    }

    public LocalDate getTanggalLahir() {
        return this.tanggalLahir;
    }

    public LocalDate getTmt() {
        return this.tmt;
    }

    public double getGajiPokok() {
        return this.gajiPokok;
    }

    public void setPegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok){
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public Period hitungMasaKerja(){
        return Period.between(tmt, LocalDate.now());
    }

    public void printInfo(){
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("TMT: " + tmt);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}