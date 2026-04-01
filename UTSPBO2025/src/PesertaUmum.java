class PesertaUmum extends Peserta {

    public PesertaUmum(String ktp, String nama, String email) {
        super(ktp, nama, email);
    }

    @Override
    public double getDiskon() {
        return 0;
    }
}