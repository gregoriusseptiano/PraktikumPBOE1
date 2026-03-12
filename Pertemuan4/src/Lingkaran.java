/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi atribut dan method dalam class Lingkaran
 * Pembuat      : Gregorius Septiano Ariadi
 * Tanggal      : Kamis, 12 Maret 2026
 */

public class Lingkaran extends BangunDatar {
    private double jari;
    // Atribut
    public Lingkaran(){
        this.jari = 0;
        setJmlSisi(1);
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
        return Math.PI * 2 * this.jari;
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
}