abstract class Peserta {
    protected String nomorKTP, nama, email;

    protected Registrasi[] daftar = new Registrasi[3]; // max 3
    protected int jumlah = 0;

    public Peserta(String nomorKTP, String nama, String email) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.email = email;
    }

    public void tambahRegistrasi(Registrasi r) {
        if (jumlah < 3) {
            daftar[jumlah] = r;
            jumlah++;
        } else {
            System.out.println("Maksimal 3 pelatihan!");
        }
    }

    public abstract double getDiskon();

    public void printInfo() {
        System.out.println("Peserta: " + nama);
        System.out.println("Email: " + email);

        for (int i = 0; i < jumlah; i++) {
            daftar[i].printDetail();
        }
    }
}