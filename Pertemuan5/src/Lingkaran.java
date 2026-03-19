/* Nama File    : Lingkaran.java
 * Deskripsi    : Membuat class Lingkaran dengan inherit BangunDatar dan implement IResize
 * Pembuat      : Gregorius Septiano Ariadi / 24060124120026
 * Tanggal      : Kamis, 19 Maret 2026
 */

public class Lingkaran extends BangunDatar implements IResize {
    private double jari;
    // Atribut
    public Lingkaran(){
        this.jari = 0;
    }

    // Method
    public Lingkaran(double diameter, String Warna, String warna, String border){
        this.jari = diameter / 2;
        this.setWarna(Warna);
        this.setBorder(border);
        this.setJmlSisi(1);
    }

    public double getJari(){
        return this.jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * (this.jari * this.jari);
    }

    public double getKeliling(){
        return 2 * Math.PI * this.jari;
    }

    public double Diagonal(){
        return 2 * this.jari;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari : " + jari);
    }

    @Override
    public void zoomIn() { 
        jari *= 1.1; // Menambah ukuran sebesar 10%
    }

    @Override
    public void zoomOut() {
        jari *= 0.9; // Mengurangi ukuran sebesar 10%
    }

    @Override
    public void zoom(int percent) {
        jari *= (1 + percent / 100.0); // Menambah ukuran sebesar persentase tertentu
    }
}