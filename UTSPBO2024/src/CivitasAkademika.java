public class CivitasAkademika {
    private String nama;
    private String email;
    private static int jumlah = 0;

    public CivitasAkademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
        jumlah++;
    }

    public void printInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
    }

    public static int getJumlah() {
        return jumlah;
    }
}
