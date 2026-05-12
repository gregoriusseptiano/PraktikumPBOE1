// Nama : Gregorius Septiano Ariadi
// Deskripsi : Program untuk mengkonversi suhu dari Celcius ke Reamur dengan menggunakan konsep MVC (Model-View-Controller)
// Tanggal : Selasa, 12 Mei 2026

import java.util.*;
import java.io.*;

class CR_Model {
    double Konversi (double sc) {
        //kamus lokal

        //algoritma
        return sc * 0.8;                
    }

    double hitung (double sc) {
        //kamus lokal

        //algoritma
        return sc * 0.8;                
    }
}

class CR_View {
    double suhuCelcius;
    double suhuReamur;
    CR_View() {
        suhuCelcius = this.getSuhu();
    }
    void show(double Sr) {
        System.out.println("Suhu Reamur: " + Sr);
    }
    double getSuhu() {
        // kamus lokal
        double cc; 
        Scanner ss;
        String t;

        //algoritma
        System.out.print("Masukkan suhu dalam Celcius: ");

        //input cc
        ss = new Scanner(System.in);
        t = ss.nextLine().toString();
        cc = Double.parseDouble(t);
        return cc;
    }
}

class CR_Controller {
    double suhuC;
    double suhuR;
    CR_View V;
    CR_Model M;
    CR_Controller() {
        M = new CR_Model();
        V = new CR_View();
        suhuC = V.getSuhu();
        suhuR = M.Konversi(suhuC);
        V.show(suhuR);
    }
    double proses(double sc, CR_View vv) {
        double reamur;
        reamur = M.hitung(sc);
        vv.show(reamur);
        return reamur;
    }
}

public class Suhu{
    public static void main(String[] args) {
        //kamus lokal
        CR_Controller v;
        //algoritma
        v = new CR_Controller();
    }
}
