public class Kendaraan {
    private String noPlat;
    private String jenis;

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
