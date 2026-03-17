/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Gregorius Septiano Ariadi
 * Tanggal      : Sabtu, 14 Maret 2026
 */

public class Dosen extends Pegawai {
    private String fakultas;

    public Dosen() {
        
    }

    public String getFakultas() {
        return this.fakultas;
    }

    public Dosen(String nip, String nama, java.time.LocalDate tanggalLahir,java.time.LocalDate tmt, double gajiPokok, String fakultas) {
            super(nip, nama, tanggalLahir, tmt, gajiPokok);
            this.fakultas = fakultas;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas: " + fakultas);
    }
}