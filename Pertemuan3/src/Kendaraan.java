/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Gregorius Septiano Ariadi
 * Tanggal      : Kamis, 5 Maret 2026
 */

public class Kendaraan {
    //===== ATRIBUT =====//
    private String noPlat;
    private String jenis;

    //===== METHOD =====//

    // Konstruktor tanpa parameter
    public Kendaraan() {
        noPlat = "";
        jenis = "";
    }

    // Konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // Getter
    public String getNoPlat() {
        return this.noPlat;
    }

    public String getJenis() {
        return this.jenis;
    }

    // Setter
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
