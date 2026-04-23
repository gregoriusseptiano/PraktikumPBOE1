/* Nama File    : Seminar.java
 * Deskripsi    : Membuat class Seminar untuk mengelola peserta seminar yang terdiri dari berbagai jenis civitas akademika, seperti 
                  mahasiswa, dosen, dan tendik. Class ini memiliki atribut array untuk menyimpan peserta seminar dan metode untuk 
                  menghitung jumlah peserta, melakukan registrasi peserta, menampilkan daftar peserta, dan menghitung jumlah mahasiswa 
                  yang terdaftar dalam seminar. 
 * Pembuat      : Gregorius Septiano Ariadi / 24060124120026
 * Tanggal      : Kamis, 23 April 2026
 */

public class Seminar {
    private Civitasakademika[] pesertas = new Civitasakademika[100];
    private int banyakPeserta;

    // b. konstruktor
    public Seminar() {
        banyakPeserta = 0;
    }

    // c. countPeserta
    public int countPeserta() {
        return banyakPeserta;
    }

    // d. registrasi
    public void registrasi(Civitasakademika c) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = c;
            banyakPeserta++;
        } else {
            System.out.println("Kapasitas penuh!");
        }
    }

    // g. tampil peserta
    public void tampilPeserta() {
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println(
                pesertas[i].getNomor() + " - " + pesertas[i].getNama()
            );
        }
    }

    // h. count mahasiswa
    public int countMahasiswa() {
        int jumlah = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                jumlah++;
            }
        }
        return jumlah;
    }
}