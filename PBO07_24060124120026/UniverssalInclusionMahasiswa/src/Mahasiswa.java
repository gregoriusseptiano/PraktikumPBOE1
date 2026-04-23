public class Mahasiswa extends Civitasakademika {
    private String NIM;
    private Dosen dosenWali;

    public Mahasiswa(String nama, String NIM, Dosen dosenWali) {
        super(nama);
        this.NIM = NIM;
        this.dosenWali = dosenWali;
    }

    @Override
    public String getNomor() {
        return NIM;
    }

    public String getNIM() {
        return NIM;
    }

    // i. set wali
    public void setWali(Dosen d) {
        this.dosenWali = d;
    }

    // j. tampil data mahasiswa
    public void tampilDataMahasiswa() {
        System.out.println("NIM   : " + NIM);
        System.out.println("Nama  : " + nama);
        System.out.println("Wali  : " + dosenWali.getNama());
    }
}