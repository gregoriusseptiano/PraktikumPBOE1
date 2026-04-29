/* Nama File    : MainOperator.java
 * Deskripsi    : Class utama untuk menguji fungsi generik pada operator tukar dan bobot.
 * Pembuat      : Gregorius Septiano Ariadi / 24060124120026
 * Tanggal      : Kamis, 30 April 2026
 */

public class MainOperator {
    public static void main(String[] args) {

        // === Integer ===
        Kotak<Integer> a = new Kotak<>(3);
        Kotak<Integer> b = new Kotak<>(6);

        System.out.println("Sebelum: a=" + a.getIsi() + ", b=" + b.getIsi());
        OperatorGenerik.Tukar(a, b);
        System.out.println("Sesudah: a=" + a.getIsi() + ", b=" + b.getIsi());
        System.out.println();

        // === String ===
        Kotak<String> s1 = new Kotak<>("Halo");
        Kotak<String> s2 = new Kotak<>("Dunia");

        System.out.println("Sebelum: s1=" + s1.getIsi() + ", s2=" + s2.getIsi());
        OperatorGenerik.Tukar(s1, s2);
        System.out.println("Sesudah: s1=" + s1.getIsi() + ", s2=" + s2.getIsi());
        System.out.println();

        // === Anabul ===
        Kotak<Anabul> h1 = new Kotak<>(new Kucing("Kitty", 3.0));
        Kotak<Anabul> h2 = new Kotak<>(new Anjing("Doggy"));

        System.out.println("Sebelum:");
        System.out.println(h1.getIsi().getNama());
        System.out.println(h2.getIsi().getNama());

        OperatorGenerik.Tukar(h1, h2);

        System.out.println("Sesudah:");
        System.out.println(h1.getIsi().getNama());
        System.out.println(h2.getIsi().getNama());
        System.out.println();

        // === Bobot2 ===
        Kucing k1 = new Anggora("Milo", 3.5);
        Kucing k2 = new KembangTelon("Luna", 4.0);

        double total = OperatorGenerik.Bobot2(k1, k2);
        System.out.println("Total bobot: " + total + " kg");
    }
}