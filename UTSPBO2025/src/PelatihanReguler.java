class PelatihanReguler extends Pelatihan {
    private int durasi;
    private String level;
    private String metode;

    public PelatihanReguler(String kode, String nama, int kuota,
                            String instruktur, double harga,
                            int durasi, String level, String metode) {
        super(kode, nama, kuota, instruktur, harga);
        this.durasi = durasi;
        this.level = level;
        this.metode = metode;
    }

@Override
public void printInfo() {
    System.out.println("Jenis: Reguler");
    System.out.println("Kode: " + kode);
    System.out.println("Nama: " + nama);
    System.out.println("Instruktur: " + namaInstruktur);
    System.out.println("Kuota: " + kuota);
    System.out.println("Harga: " + harga);
    System.out.println("Durasi: " + durasi + " bulan");
    System.out.println("Level: " + level);
    System.out.println("Metode: " + metode);
    System.out.println("----------------------");
}
    
}