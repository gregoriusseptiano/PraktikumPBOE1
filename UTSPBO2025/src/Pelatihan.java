abstract class Pelatihan {
    protected String kode, nama, namaInstruktur;
    protected int kuota;
    protected double harga;
    protected static double pajak = 0.1; // static

    public Pelatihan(String kode, String nama, int kuota,
                     String namaInstruktur, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.kuota = kuota;
        this.namaInstruktur = namaInstruktur;
        this.harga = harga;
    }

    public double hitungHargaAkhir(double diskon) {
        return (harga - (diskon * harga)) + (pajak * harga);
    }

    public abstract void printInfo();
}