/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Gregorius Septiano Ariadi
 * Tanggal      : Kamis, 19 Februari 2026
 */

public class Titik {
    /***************ATRIBUT***************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /***************METHOD***************/
    // konstruktor untuk membuat titik (0,0)
    public Titik(){
        this(0,0);
        counterTitik++;
    }

    // konstruktor untuk membuat dengan nilai absis dan ordinat tertentu 
    public Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    // mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }

    // mengembalikan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    public void setAbsis(double x){
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y){
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // mencetak koordinat titik
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // mengembalikan nilai counterTitik
    public static int getCounterTitik(){
        return counterTitik;
    }

    // public void printCounterTitik(){
    //     System.out.println(this.counterTitik);
    // }   

    // menentukan kuadran
    public int getKuadran(){
        if(absis > 0 && ordinat > 0) return 1;
        if(absis < 0 && ordinat > 0) return 2;
        if(absis < 0 && ordinat < 0) return 3;
        if(absis > 0 && ordinat < 0) return 4;
        return 0; // jika di sumbu
    }

    // jarak ke pusat (0,0)
    public double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    // jarak ke titik lain
    public double getJarak(Titik T){
        double dx = absis - T.absis;
        double dy = ordinat - T.ordinat;
        return Math.sqrt(dx*dx + dy*dy);
    }

    // refleksi terhadap sumbu X 
    public void refleksiX(){
        ordinat = -ordinat;
    }

    // refleksi terhadap sumbu Y 
    public void refleksiY(){
        absis = -absis;
    }

    // menghasilkan titik baru hasil refleksi sumbu X
    public Titik getRefleksiX(){
        return new Titik(absis, -ordinat);
    }

    // menghasilkan titik baru hasil refleksi sumbu Y
    public Titik getRefleksiY(){
        return new Titik(-absis, ordinat);
    }

} // end class Titik