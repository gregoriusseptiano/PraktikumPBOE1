class PesertaMember extends Peserta {
    private String nomorAnggota;
    private String tanggalGabung;
    private static double diskon = 0.1; // static

    public PesertaMember(String ktp, String nama, String email,
                         String nomorAnggota, String tanggalGabung) {
        super(ktp, nama, email);
        this.nomorAnggota = nomorAnggota;
        this.tanggalGabung = tanggalGabung;
    }

    @Override
    public double getDiskon() {
        return diskon;
    }
}