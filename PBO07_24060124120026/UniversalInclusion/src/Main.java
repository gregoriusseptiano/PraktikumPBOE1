public class Main {
    public static void main(String[] args) {

        // Polimorfisme: tipe Anabul, objek beda-beda
        Anabul[] hewan = {
            new Kucing("Kitty"),
            new Anjing("Doggy"),
            new Burung("Tweety")
        };

        for (Anabul a : hewan) {
            a.gerak();
            a.bersuara();
            System.out.println();
        }
    }
}