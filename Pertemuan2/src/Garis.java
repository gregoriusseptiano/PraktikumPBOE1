/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Gregorius Septiano Ariadi
 * Tanggal      : Jumat, 27 Februari 2026
 */

public class Garis {
    /*************** ATRIBUT ***************/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /*************** METHOD ***************/
    // Konstruktor tanpa parameter
    // titik awal (0,0) dan titik akhir (1,1)
    public Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // Konstruktor dengan parameter
    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Getter titikAwal
    public Titik getTitikAwal() {
        return titikAwal;
    }

    // Setter titikAwal
    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    // Getter titikAkhir
    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    // Setter titikAkhir
    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    // Getter counterGaris
    public static int getCounterGaris() {
        return counterGaris;
    }

    // Menghitung panjang garis
    public double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    // Menghitung gradien (m)
    public double getGradien() {
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double x2 = titikAkhir.getAbsis();
        double y2 = titikAkhir.getOrdinat();

    if (x2 - x1 == 0) {
        return Double.POSITIVE_INFINITY; // garis vertikal
    }
        return (y2 - y1) / (x2 - x1);
    }

    // Menghitung titik tengah
    public Titik getTitikTengah() {
        double xTengah = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double yTengah = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(xTengah, yTengah);
    }

    // Mengecek apakah sejajar
    public boolean isSejajar(Garis G) {
        return Math.abs(this.getGradien() - G.getGradien()) < 0.0001;
    }

    // Mengecek apakah tegak lurus
    public boolean isTegakLurus(Garis G) {
        return Math.abs(this.getGradien() * G.getGradien() + 1) < 0.0001;
    }

    // Menampilkan titik awal dan akhir
    public void printGaris() {
        System.out.print("Titik Awal: ");
        titikAwal.printTitik();
        System.out.print("Titik Akhir: ");
        titikAkhir.printTitik();
    }

    // Menampilkan persamaan garis y = mx + c
    public String getPersamaanGaris() {
        if (titikAwal.getAbsis() == titikAkhir.getAbsis()) {
            return "x = " + titikAwal.getAbsis();
        }

        double m = getGradien();
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double c = y1 - (m * x1);

        return "y = " + m + "x + " + c;
    }

} // end class Garis
