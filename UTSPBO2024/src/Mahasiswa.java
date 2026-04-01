public class Mahasiswa extends CivitasAkademika {
    private String nim;
    private int semester;
    private Fakultas fakultas;
    private static int jumlahMahasiswa = 0;

    public Mahasiswa(String nama, String email, String nim, int semester, Fakultas fakultas) {
        super(nama, email);
        this.nim = nim;
        this.semester = semester;
        this.fakultas = fakultas;
        jumlahMahasiswa++;
    }

    public double hitungUKT() {
        double ukt = fakultas.getTarifUKT();
        return ukt - (0.05 * semester * ukt);
    }

    public static int getJumlahMahasiswa() {
        return jumlahMahasiswa;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIM: " + nim);
        System.out.println("Semester: " + semester);    
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("UKT: " + hitungUKT());
    }
}
