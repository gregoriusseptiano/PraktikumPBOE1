public class PelatihanInsidental extends Pelatihan {

    private String tanggal;
    private String metode;

    public PelatihanInsidental(String kode, String nama, int kuota,
                               String instruktur, double harga,
                               String tanggal, String metode) {
        super(kode, nama, kuota, instruktur, harga);
        this.tanggal = tanggal;
        this.metode = metode;
    }

    @Override
    public void printInfo() {
        System.out.println("Jenis: Insidental");
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Instruktur: " + namaInstruktur);
        System.out.println("Kuota: " + kuota);
        System.out.println("Harga: " + harga);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Metode: " + metode);
        System.out.println("----------------------");
    }
}
