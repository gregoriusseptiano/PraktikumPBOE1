/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Gregorius Septiano Ariadi
 * Tanggal      : Kamis, 5 Maret 2026
 */

import java.util.ArrayList;

public class Mahasiswa {
    //===== ATRIBUT =====//
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    //===== METHOD =====//

    // konstruktor tanpa parameter
    public Mahasiswa() {
        this("", "", "");
        this.listMatKul = new ArrayList<>();
    }

    // konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }

    // Getter

    // menghitung jumlah SKS
    public int getJumlahSKS() {
        int total = 0;

        for (int i = 0; i < listMatKul.size(); i++) {
            total = total + listMatKul.get(i).getSks();
        }

        return total;
    }

    // menghitung jumlah mata kuliah
    public int getJumlahMatKul() {
        return listMatKul.size();
    }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getProdi() {
        return this.prodi;
    }

    public ArrayList<MataKuliah> getListMatKul() {
        return this.listMatKul;
    }

    public Dosen getDosenWali() {
        return this.dosenWali;
    }

    public Kendaraan getKendaraan() {
        return this.kendaraan;
    }

    // Setter
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    /*************** METHOD TAMBAHAN ***************/

    // menambah mata kuliah
    public void addMatKul(MataKuliah newMatKul) {
        listMatKul.add(newMatKul);
    }

    // menampilkan data mahasiswa
    public void printMhs() {
        System.out.println("NIM  : " + this.nim);
        System.out.println("Nama : " + this.nama);
        System.out.println("Prodi : " + this.prodi);
    }

    public void printDetailMhs(){
        System.out.println("NIM : " + this.nim);
        System.out.println("Nama : " + this.nama);
        System.out.println("Prodi : " + this.prodi);
        System.out.println("Daftar Mata Kuliah : ");
        int i;
        for(i = 0; i < listMatKul.size(); i++){
            System.out.println(listMatKul.get(i).getNamaMatkul());
        }
        
        System.out.println("NIP Dosen Wali : " + dosenWali.getNip());
        System.out.println("Nama Dosen Wali : " + dosenWali.getNama());
        System.out.println("No Plat Kendaraan : " + kendaraan.getNoPlat());
        System.out.println("Jenis Kendaraan : " + kendaraan.getJenis());
    }


}