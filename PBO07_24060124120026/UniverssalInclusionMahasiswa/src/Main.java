public class Main {
    public static void main(String[] args) {

        // e. buat dosen
        Dosen d1 = new Dosen("Pak Budi", "D001");
        Dosen d2 = new Dosen("Bu Sari", "D002");

        // e. buat mahasiswa
        Mahasiswa m1 = new Mahasiswa("Fahri", "M001", d1);
        Mahasiswa m2 = new Mahasiswa("Andi", "M002", d1);
        Mahasiswa m3 = new Mahasiswa("Sinta", "M003", d2);
        Mahasiswa m4 = new Mahasiswa("Rina", "M004", d2);
        Mahasiswa m5 = new Mahasiswa("Dika", "M005", d1);

        // b. seminar
        Seminar s = new Seminar();

        // f. registrasi
        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(m1);
        s.registrasi(m2);
        s.registrasi(m3);
        s.registrasi(m4);
        s.registrasi(m5);

        // c. jumlah peserta
        System.out.println("Total Peserta: " + s.countPeserta());

        // g. tampil peserta
        System.out.println("\nDaftar Peserta:");
        s.tampilPeserta();

        // h. jumlah mahasiswa
        System.out.println("\nJumlah Mahasiswa: " + s.countMahasiswa());

        // i. ubah wali
        m1.setWali(d2);

        // j. tampil data mahasiswa
        System.out.println("\nData Mahasiswa:");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
    }
}
