/* Nama File    : Persegi.java
 * Deskripsi    : Membuat class persegi dengan inherit BangunDatar
 * Pembuat      : Gregorius Septiano Ariadi / 24060124120026
 * Tanggal      : Kamis, 19 Maret 2026
 */

public class Persegi extends BangunDatar implements IResize {
    // Atribut
    private double sisi;

    //Method
    public Persegi() {
        this.sisi = 0;
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public void setPersegi(double sisi, String warna, String border) {
        this.sisi = sisi;
        this.setWarna(warna);
        this.setBorder(border);
        this.setJmlSisi(4);
    }

    public double getSisi() {
        return this.sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas(){
        return this.sisi * this.sisi;
    }

    public double getKeliling(){
        return 4 * this.sisi;
    }

    public double getDiagonal(){
        return Math.sqrt(this.sisi*this.sisi + this.sisi*this.sisi);
    }

    @Override
    public void printInfo() {
        System.out.println("Jumlah sisi: " + getJmlSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Sisi: " + sisi);
    }

    @Override
    public void zoomIn() {
        sisi *= 1.1; // Menambah ukuran sebesar 10%
    }

    @Override
    public void zoomOut() {
        sisi *= 0.9; // Mengurangi ukuran sebesar 10%
    }

    @Override
    public void zoom(int percent) {
        sisi *= (1 + percent / 100.0); // Menambah ukuran sebesar persentase tertentu
    }
}

