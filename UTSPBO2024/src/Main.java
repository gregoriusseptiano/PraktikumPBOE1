public class Main {
    public static void main(String[] args) {

        // Membuat objek Fakultas
        Fakultas fsm = new Fakultas("FSM", 5000000, 6000000);

        // ========================
        // DATA MAHASISWA
        // ========================
        Mahasiswa m1 = new Mahasiswa("Tio", "tio@mail.com", "20026", 3, fsm);
        Mahasiswa m2 = new Mahasiswa("Budi", "budi@mail.com", "20027", 2, fsm);

        // ========================
        // DATA DOSEN
        // ========================
        Dosen d1 = new Dosen("Pak Budi", "budi@mail.com", "123", 5, fsm);
        Dosen d2 = new Dosen("Bu Ani", "ani@mail.com", "124", 3, fsm);

        // ========================
        // OUTPUT MAHASISWA
        // ========================
        System.out.println("=== DATA MAHASISWA ===");
        m1.printInfo();
        System.out.println();
        m2.printInfo();

        // ========================
        // OUTPUT DOSEN
        // ========================
        System.out.println("\n=== DATA DOSEN ===");
        d1.printInfo();
        System.out.println();
        d2.printInfo();

        // ========================
        // TOTAL CIVITAS
        // ========================
        System.out.println("\nJumlah Civitas Akademika: " + CivitasAkademika.getJumlah());
        System.out.println("\nJumlah Civitas Dosen: " + Dosen.getJumlahDosen());
        System.out.println("\nJumlah Civitas Mahasiswa: " + Mahasiswa.getJumlahMahasiswa());
    }
}