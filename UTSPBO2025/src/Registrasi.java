class Registrasi {
    private String tanggalRegistrasi, tanggalBayar, metodePembayaran;
    private Pelatihan pelatihan;
    private Peserta peserta;

    public Registrasi(String tglReg, String tglBayar, String metode,
                      Peserta peserta, Pelatihan pelatihan) {
        this.tanggalRegistrasi = tglReg;
        this.tanggalBayar = tglBayar;
        this.metodePembayaran = metode;
        this.peserta = peserta;
        this.pelatihan = pelatihan;
    }

    public double hitungTotal() {
        double diskon = peserta.getDiskon();
        return pelatihan.hitungHargaAkhir(diskon);
    }

    public void printDetail() {
        System.out.println("Pelatihan: " + pelatihan.nama);
        System.out.println("Total Bayar: " + hitungTotal());
        System.out.println("Metode: " + metodePembayaran);
        System.out.println("----------------------");
    }
}