/* Nama File    : CivitasAkademika.java
 * Deskripsi    : Membuat class Civitasakademika sebagai kelas dasar untuk berbagai jenis civitas akademika dengan 
                  atribut nama dan method getNama serta getNomor. Method getNomor akan dioverride pada subclass 
                  untuk memberikan nomor identitas yang spesifik sesuai dengan jenis civitas akademika, seperti NIM untuk mahasiswa, NIP untuk dosen, dan NIK untuk tendik.
 * Pembuat      : Gregorius Septiano Ariadi / 24060124120026
 * Tanggal      : Kamis, 23 April 2026
 */

public class CivitasAkademika {
    protected String nama;

    public CivitasAkademika(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // akan dioverride
    public String getNomor() {
        return "-";
    }
}