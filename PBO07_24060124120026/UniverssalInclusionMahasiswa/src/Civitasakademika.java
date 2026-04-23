public class Civitasakademika {
    protected String nama;

    public Civitasakademika(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // akan dioverride
    public String getNomor() {
        return "-";
    }
}