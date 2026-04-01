public class MPeserta {
    public static void main(String[] args) {
        Pelatihan p1 = new PelatihanReguler("P01", "Java", 20,
                "Pak Budi", 1000000, 6, "basic", "kelompok");

        Peserta m1 = new PesertaMember("123", "Tio", "tio@mail.com",
                "M001", "2024");

        Registrasi r1 = new Registrasi("01-01-2025", "02-01-2025",
                "transfer", m1, p1);

        m1.tambahRegistrasi(r1);

        // tampilkan
        p1.printInfo();
        m1.printInfo();
    }
}