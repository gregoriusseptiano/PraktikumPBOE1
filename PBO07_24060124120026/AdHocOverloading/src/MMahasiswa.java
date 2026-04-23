public public class MMahasiswa {
    public static void main(String[] args) {

        // c. Konstruktor tanpa parameter
        Mahasiswa m1 = new Mahasiswa();
        System.out.println("Objek m1 (default):");
        m1.tampil();

        // d. Konstruktor 3 parameter
        Mahasiswa m2 = new Mahasiswa("120037", "Fahri", "Informatika");
        System.out.println("Objek m2 (parameter):");
        m2.tampil();

        // e. Copy constructor (clone)
        Mahasiswa m3 = new Mahasiswa(m2);
        System.out.println("Objek m3 (clone dari m2):");
        m3.tampil();

        // b. Uji semua varian setProgramStudi

        // varian 1 (tanpa parameter)
        m1.setProgramStudi();
        System.out.println("Set tanpa parameter:");
        m1.tampil();

        // varian 2 (String)
        m1.setProgramStudi("Sistem Informasi");
        System.out.println("Set dengan String:");
        m1.tampil();

        // varian 3 (objek)
        m1.setProgramStudi(m2);
        System.out.println("Set dengan objek Mahasiswa:");
        m1.tampil();
    }
} 