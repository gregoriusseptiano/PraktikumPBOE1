/* Nama File    : MataKuliah.java
 * Deskripsi    : berisi atribut dan method dalam class MataKuliah
 * Pembuat      : Gregorius Septiano Ariadi
 * Tanggal      : Kamis, 5 Maret 2026
 */

public class MataKuliah {
    //===== ATRIBUT =====//
    private String idMatKul;
    private String namamatkul;
    private int sks;

    //===== METHOD =====//

    // Konstruktor tanpa parameter
    public MataKuliah() {
        idMatKul = "";
        namamatkul = "";
        sks = 0;
    }

    // Konstruktor dengan parameter
    public MataKuliah(String idMatKul, String namamatkul, int sks) {
        this.idMatKul = idMatKul;
        this.namamatkul = namamatkul;
        this.sks = sks;
    }

    // Getter
    public String getIdMatKul() {
        return this.idMatKul;
    }

    public String getNamaMatkul() {
        return this.namamatkul;
    }

    public int getSks() {
        return this.sks;
    }

    // Setter
    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    public void setNamaMatkul(String namamatkul) {
        this.namamatkul = namamatkul;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
