/* Nama File    : MTeman.java
 * Deskripsi    : Main aplikasi kelas Teman
 * Pembuat      : Gregorius Septiano Ariadi / 24060124120026
 * Tanggal      : Kamis, 7 Mei 2026
 */

public class MTeman {
    public static void main(String[] args) {
        Teman t = new Teman();
        t.addNama("Budi");
        t.addNama("Andi");
        t.addNama("Siti");
        t.addNama("Andi");

        System.out.println("Daftar Teman:");
        t.showTeman();
        System.out.println("\nJumlah elemen : " + t.getNbelm());
        System.out.println("\nApakah Andi member?");
        System.out.println(t.isMember("Andi"));
        System.out.println("\nJumlah nama Andi:");
        System.out.println(t.countNama("Andi"));

        t.gantiNama("Budi", "Bayu");
        System.out.println("\nSetelah ganti nama:");
        t.showTeman();
        t.delNama("Siti");
        System.out.println("\nSetelah hapus Siti:");
        t.showTeman();
    }
}