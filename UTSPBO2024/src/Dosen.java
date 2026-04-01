class Dosen extends Karyawan {
    private Fakultas fakultas;
    private static int jumlahDosen = 0;

    public Dosen(String nama, String email, String nip, int masaKerja, Fakultas fakultas) {
        super(nama, email, nip, masaKerja);
        this.fakultas = fakultas;
        jumlahDosen++;
    }

    public double hitungGaji() {
        double gp = fakultas.getGajiPokok();
        return gp + (masaKerja * 0.01 * gp);
    }

    public static int getJumlahDosen() {
        return jumlahDosen;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIP: " + nip);
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("Gaji: " + hitungGaji());
    }
}