/* Nama File    : Mahasiswa.java
 * Deskripsi    : Membuat dan belajar tentang polimorfisme adhoc overloading pada class Mahasiswa dengan atribut NIM, Nama, dan Program Studi. 
                  Terdapat 3 konstruktor dan 3 method setProgramStudi yang berbeda parameter. Juga terdapat method 
                  tampil untuk menampilkan informasi mahasiswa.
 * Pembuat      : Gregorius Septiano Ariadi / 24060124120026
 * Tanggal      : Kamis, 23 April 2026
 */

public class Mahasiswa {
    private String NIM;
    private String Nama;
    private String ProgramStudi;

    // c. Konstruktor tanpa parameter
    public Mahasiswa() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.ProgramStudi = "n/a";
    }

    // d. Konstruktor 3 parameter
    public Mahasiswa(String NIM, String Nama, String ProgramStudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.ProgramStudi = ProgramStudi;
    }

    // e. Copy constructor (cloning)
    public Mahasiswa(Mahasiswa m) {
        this.NIM = m.NIM;
        this.Nama = m.Nama;
        this.ProgramStudi = m.ProgramStudi;
    }

    // Getter
    public String getNIM() { return NIM; }
    public String getNama() { return Nama; }
    public String getProgramStudi() { return ProgramStudi; }

    // Setter
    public void setNIM(String NIM) { this.NIM = NIM; }
    public void setNama(String Nama) { this.Nama = Nama; }

    // b. Method overloading (polimorfisme)
    public void setProgramStudi() {
        this.ProgramStudi = "Kosong";
    }

    public void setProgramStudi(String prodi) {
        this.ProgramStudi = prodi;
    }

    public void setProgramStudi(Mahasiswa m) {
        this.ProgramStudi = m.getProgramStudi();
    }

    // Method tampil
    public void tampil() {
        System.out.println("NIM            : " + NIM);
        System.out.println("Nama           : " + Nama);
        System.out.println("Program Studi  : " + ProgramStudi);
    }
}